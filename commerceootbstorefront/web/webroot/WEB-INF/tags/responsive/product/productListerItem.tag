<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="action" tagdir="/WEB-INF/tags/responsive/action" %>

<%@ attribute name="showLinks" required="false" type="java.lang.Boolean" %>
<%@ attribute name="starsClass" required="false" type="java.lang.String" %>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<spring:theme code="text.addToCart" var="addToCartText"/>
<c:url value="${product.url}" var="productUrl"/>
<c:set value="${not empty product.potentialPromotions}" var="hasPromotion"/>
<c:set value="product__list--item" var="productTagClasses"/>
<c:forEach var="tag" items="${product.tags}">
    <c:set value="${productTagClasses} tag-${tag}" var="productTagClasses"/>
</c:forEach>
<style>
.product__reference{
    display:flex;
    gap:25px;
}
.product__box{
max-width:250px;
width:100%;
padding:10px;
box-shadow:1px 1px 2px 1px #1e1e1e
}
</style>
<li class="${fn:escapeXml(productTagClasses)}">
    <ycommerce:testId code="test_searchPage_wholeProduct">
        <a class="product__list--thumb" href="${fn:escapeXml(productUrl)}" title="${fn:escapeXml(product.name)}">
            <product:productPrimaryImage product="${product}" format="thumbnail"/>
        </a>
        <ycommerce:testId code="searchPage_productName_link_${product.code}">
            <a class="product__list--name" href="${fn:escapeXml(productUrl)}">${ycommerce:sanitizeHTML(product.name)}</a>
        </ycommerce:testId>

        <div class="product__list--price-panel">
            <c:if test="${not empty product.potentialPromotions}">
                <div class="product__listing--promo">
                    <c:forEach items="${product.potentialPromotions}" var="promotion">
                        ${ycommerce:sanitizeHTML(promotion.description)}
                    </c:forEach>
                </div>
            </c:if>

            <ycommerce:testId code="searchPage_price_label_${product.code}">
                <div class="product__listing--price">
                    <product:productListerItemPrice product="${product}"/>
                </div>
            </ycommerce:testId>
        </div>

        <c:if test="${not empty product.summary}">
            <div class="product__listing--description">${ycommerce:sanitizeHTML(product.summary)}</div>
        </c:if>

        <div class="rating">
            <c:set var="ratingJson">${ycommerce:encodeJSON(product.averageRating)}</c:set>
            <div class="rating-stars pull-left js-ratingCalc ${fn:escapeXml(starsClass)}" data-rating='{"rating":"${fn:escapeXml(ratingJson)}","total":5}'>
                <div class="greyStars">
                    <c:forEach begin="1" end="5">
                        <span class="glyphicon glyphicon-star"></span>
                    </c:forEach>
                </div>
                <div class="greenStars js-greenStars">
                    <c:forEach begin="1" end="5">
                        <span class="glyphicon glyphicon-star active"></span>
                    </c:forEach>
                </div>
            </div>

            <c:if test="${not empty product.reviews}">
                <spring:theme code="review.based.on" arguments="${fn:length(product.reviews)}" />
            </c:if>

            <c:choose>
                <c:when test="${showLinks}">
                    <c:if test="${not empty product.reviews}">
                        <a href="#tabreview" class="js-openTab"><spring:theme code="review.see.reviews" /></a>
                    </c:if>
                    <a href="#tabreview" class="js-writeReviewTab"><spring:theme code="review.write.title" /></a>
                </c:when>
                <c:otherwise>
                    <spring:theme code="review.reviews" />
                </c:otherwise>
            </c:choose>
        </div><hr>

        <c:if test="${not empty product.bundledProduct}">
        <h3>Similar Products</h3>
            <div class="product__reference">
                <c:forEach items="${product.bundledProduct}" var="bundledProduct">
                    <div class="product__box">
                        <spring:url var="productRefURL" value="{contextPath}${bundledProduct.productUrl}" htmlEscape="false">
                            <spring:param name="contextPath" value="${request.contextPath}" />
                        </spring:url>
                        <a href="${productRefURL}"><img src="${ycommerce:sanitizeHTML(bundledProduct.productRefImg)}" width="100px"/><br></a>
                        <h3>${ycommerce:sanitizeHTML(bundledProduct.productRefDesc)}</h3>
                        <h4>Price: $ ${ycommerce:sanitizeHTML(bundledProduct.productPrice)}</h4>
                        <div class="rating">
                            <c:set var="ratingJson">${ycommerce:encodeJSON(bundledProduct.productRating)}</c:set>
                            <div class="rating-stars pull-left js-ratingCalc ${fn:escapeXml(starsClass)}" data-rating='{"rating":"${fn:escapeXml(ratingJson)}","total":5}'>
                                <div class="greyStars">
                                    <c:forEach begin="1" end="5">
                                        <span class="glyphicon glyphicon-star"></span>
                                    </c:forEach>
                                </div>
                                <div class="greenStars js-greenStars">
                                    <c:forEach begin="1" end="5">
                                        <span class="glyphicon glyphicon-star active"></span>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </c:if>

        <c:set var="product" value="${product}" scope="request"/>
        <c:set var="addToCartText" value="${addToCartText}" scope="request"/>
        <c:set var="addToCartUrl" value="${addToCartUrl}" scope="request"/>
        <div class="addtocart">
            <div id="actions-container-for-${fn:escapeXml(component.uid)}" class="row">
                <action:actions element="div" parentComponent="${component}"  />
            </div>
        </div>
    </ycommerce:testId>
</li>
