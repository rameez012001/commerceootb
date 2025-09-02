alert('hello')
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