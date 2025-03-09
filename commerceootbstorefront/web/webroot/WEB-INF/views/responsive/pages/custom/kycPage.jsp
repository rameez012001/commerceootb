<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">
    <cms:pageSlot position="SamsungS10SlotName" var="feature" element="div" class="customCmsOffer">
        <cms:component component="${feature}" />
    </cms:pageSlot>
    <cms:pageSlot position="KycParagraph" var="feature" element="div" class="kycParagraph">
            <cms:component component="${feature}" />
    </cms:pageSlot>

    <cms:pageSlot position="KycForm" var="feature" element="div" class="kycForm">
            <cms:component component="${feature}" />
    </cms:pageSlot>

</template:page>