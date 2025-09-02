<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>
<c:set var="commonResourcePathHtml" value="${fn:escapeXml(commonResourcePath)}" />

<html>
<head>
    <title>Payment Options</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f9f9f9;
        }

        h2, h3 {
            color: #2c3e50;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            margin-top: 20px;
        }

        table th, table td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        table th {
            background-color: #ecf0f1;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        button {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #27ae60;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
        }

        button:hover {
            background-color: #219150;
        }

        .error {
            color: red;
            margin-bottom: 20px;
            font-weight: bold;
        }

        .info-block {
            background-color: #fff;
            padding: 20px;
            margin-top: 20px;
            border-left: 5px solid #3498db;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }

        .info-block p {
            margin: 6px 0;
        }
    </style>
</head>

<body>

    <h2>FLOA Payment</h2>

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>

    <c:if test="${not empty dealTemplate}">
        <div class="info-block">
            <h3>Deal Template Created</h3>
            <p><strong>Merchant Reference:</strong> ${dealTemplate.dealReference}</p>
            <p><strong>Product:</strong> ${dealTemplate.productName}</p>
            <p><strong>Status:</strong> ${dealTemplate.status}</p>
            <p><strong>Total Amount:</strong> ${dealTemplate.customerTotalAmount}</p>
            <p><strong>Customer Fees:</strong> ${dealTemplate.customerFees}</p>
            <p><strong>Merchant Financed:</strong> ${dealTemplate.merchantFinancedAmount}</p>

            <c:forEach var="link" items="${dealTemplate.links}">
                <c:if test="${link.rel == 'finalize-deal'}">
                    <form:form method="post" action="${pageContext.request.contextPath}/checkout/multi/payment-method/finalizeDeal1/${dealTemplate.dealReference}">
                        <input type="hidden" name="dealReference" value="${dealTemplate.dealReference}" />
                        <button type="submit">Finalize Deal</button>
                    </form:form>
                </c:if>
            </c:forEach>
        </div>
    </c:if>

    <c:if test="${empty dealTemplate}">
        <c:choose>
            <c:when test="${not empty simulatedPlans}">
                <form:form id="dealForm" method="post" action="${pageContext.request.contextPath}/checkout/multi/payment-method/createDealTemplate">
                    <table>
                        <thead>
                            <tr>
                                <th>Select</th>
                                <th>Product Name</th>
                                <th>Installments</th>
                                <th>Total Amount</th>
                                <th>Customer Fees</th>
                                <th>Details</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="plan" items="${simulatedPlans}">
                                <tr>
                                    <td><input type="radio" name="productCode" value="${plan.productCode}" required /></td>
                                    <td>${plan.productName}</td>
                                    <td>${plan.installmentCount}</td>
                                    <td>${plan.customerTotalAmount}</td>
                                    <td>${plan.customerFees}</td>
                                    <td>
                                        <c:forEach var="installment" items="${plan.simulatedInstallments}">
                                            ${installment.rank}. ${installment.date} - ${installment.amount} <br />
                                        </c:forEach>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <button type="submit">Continue with Selected Plan</button>
                </form:form>
            </c:when>
            <c:otherwise>
                <p>No installment plans available.</p>
            </c:otherwise>
        </c:choose>
    </c:if>
    <a href="${pageContext.request.contextPath}/checkout/multi/payment-method/payment-success">next step</a>

    <script>
        document.addEventListener("DOMContentLoaded", function () {
            const form = document.getElementById("dealForm");
            if (!form) return;

            form.addEventListener("submit", function (e) {
                e.preventDefault();
                const selected = document.querySelector("input[name='productCode']:checked");
                if (!selected) {
                    alert("Please select a product plan.");
                    return;
                }
                const productCode = encodeURIComponent(selected.value);
                form.action = "${pageContext.request.contextPath}/checkout/multi/payment-method/createDealTemplate/" + productCode;
                form.submit();
            });
        });
    </script>
</body>
</html>
