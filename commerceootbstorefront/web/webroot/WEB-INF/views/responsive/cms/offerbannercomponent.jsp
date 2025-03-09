<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<%@ taglib prefix="breadcrumb" tagdir="/WEB-INF/tags/desktop/nav/breadcrumb" %>
<html>
<head>
<style>
.offerBannerComponent {
    align-items: center;
    justify-content: space-between;
    padding: 10px 20px;
    border-radius: 20px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    background: linear-gradient(135deg, #A7F3D0, #93C5FD);
    color: #000;
    max-width: 600px;
    margin: 0 auto;
    overflow: hidden;
}
.productLogo,.productImage{
    padding:10px;
}
.productLogo img{
 width:100px;
}
.productLogo img, .productImage img {
    max-width: 100px;
    border-radius: 10px;

}

.innerBox {
    display: flex;
    flex-direction: row;
    align-items: center;
    border-radius: 20px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    background: linear-gradient(135deg, #93C5FD,#A7F3D0);
    padding: 20px;
    justify-content: space-between;
    width: 100%;
}

.left-content h1 {
    font-size: 24px;
    font-weight: bold;
}

.left-content p {
    font-size: 16px;
    margin: 5px 0;
}

.left-content a {
    display: inline-block;
    padding: 10px 20px;
    background-color: #000;
    color: #fff;
    text-decoration: none;
    border-radius: 8px;
    font-weight: bold;
}

.left-content a:hover {
    background-color: #333;
}

.right-content .productImage img {
    max-width: 150px;
}
#wasPrice{
    text-decoration:line-through;
}

</style>
<body>

<spring:url var="productURL" value="{contextPath}${isPrice.url}" htmlEscape="false">
    <spring:param name="contextPath" value="${request.contextPath}" />
</spring:url>

<div class="offerBannerComponent">
<div class="productLogo">
    <img src="${productImage.url}" alt="productImg" id="productLogo">
</div>
    <div class="innerBox">
        <div class="left-content">
            <h1>${title}</h1>
            <p>${description}</p>
            <p>offer <span id="wasPrice">$ ${wasPrice}</span></p>
            <a href="${fn:escapeXml(productURL)}">Starting at $ ${isPrice.linkName}</a>
        </div>
        <div class="right-content">
            <div class="productImage">
                <img src="${productLogo.url}" alt="productLogo" id="productImage">
            </div>
        </div>
    </div>
</div>
</body>
</html>