<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<div class="account-section-header">
    <div class="row">
        <div class="container-lg col-md-6">
            <spring:theme code="text.account.profile.updatePersonalDetails"/>
        </div>
    </div>
</div>
<div class="row">
    <div class="container-lg col-md-6">
        <div class="account-section-content">
            <div class="account-section-form">
                 <form:form action="kyc/update-profile" method="post" modelAttribute="updateProfileForm">

                    <h3>Kyc Details</h3>
                    <formElement:formInputBox idKey="profile.nationality" labelKey="Nationality" path="nationality" inputCSS="text" mandatory="true"/>
                    <form:label path="dob">Date Of Birth</form:label><br>
                    <form:input type="date" path="dob"/><br>
                    <formElement:formInputBox idKey="postalCode" labelKey="Postal Code" path="postalCode" inputCSS="text" mandatory="true"/>

                    <div>
                        <label>Document Type</label><br>
                        <select id="documentType" name="documentType" required>
                            <option value="AADHAAR">Aadhaar</option>
                            <option value="PAN CARD">Pan card</option>
                            <option value="LICENSE">License</option>
                            <option value="VOTER">VoterId</options>
                            <option value="Others">Others</options>
                        </select>
                    </div>
                    <formElement:formInputBox idKey="documentId" labelKey="Document ID" path="documentId" inputCSS="text" mandatory="true"/>
                    <form:label path="issuedDate">Issued Date</form:label><br>
                                        <form:input type="date" path="issuedDate"/><br>
                                        <form:label path="expiryDate">Expiry Date</form:label><br>
                    <form:input type="date" path="expiryDate"/><br>

                    <div class="row">
                        <div class="col-sm-6 col-sm-push-6">
                            <div class="accountActions">
                                <ycommerce:testId code="personalDetails_savePersonalDetails_button">
                                    <button type="submit" class="btn btn-primary btn-block">
                                        <spring:theme code="text.account.profile.saveUpdates" text="Save Updates"/>
                                    </button>
                                </ycommerce:testId>
                            </div>
                        </div>
                        <div class="col-sm-6 col-sm-pull-6">
                            <div class="accountActions">
                                <ycommerce:testId code="personalDetails_cancelPersonalDetails_button">
                                    <button type="button" class="btn btn-default btn-block backToHome">
                                        <spring:theme code="text.account.profile.cancel" text="Cancel"/>
                                    </button>
                                </ycommerce:testId>
                            </div>
                        </div>
                    </div>
                    </form:form>
                <h3>Kyc Data</h3>
                <table>
                    <thead>
                        <tr>
                            <th>Document ID</th>
                            <th>Document Type</th>
                            <th>Nationality</th>
                            <th>DOB</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${updateProfileForm.documentId}</td>
                            <td>${updateProfileForm.documentType}</td>
                            <td>${updateProfileForm.nationality}</td>
                            <td>${updateProfileForm.dob}</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

