package com.commerceootb.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerReversePopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


public class ModifiedCustomerReversePopulator extends CustomerReversePopulator {

    @Override
    public void populate(final CustomerData customerData, final CustomerModel customerModel) throws ConversionException
    {
        super.populate(customerData,customerModel);
        populateAddresses(customerData,customerModel);
    }

    private void populateAddresses(final CustomerData customerData, final CustomerModel customerModel)
    {
        if (customerModel.getDefaultPaymentAddress() == null)
        {
            if (customerData.getDefaultBillingAddress() != null)
            {
                final AddressModel paymentAddress = getModelService().create(AddressModel.class);
                getAddressReversePopulator().populate(customerData.getDefaultBillingAddress(), paymentAddress);
                paymentAddress.setOwner(customerModel);
                paymentAddress.setAddressId(customerModel.getDefaultShipmentAddress().getAddressId());
                customerModel.setDefaultPaymentAddress(paymentAddress);
            }

        }
        else
        {
            getAddressReversePopulator().populate(customerData.getDefaultBillingAddress(), customerModel.getDefaultPaymentAddress());
        }

        if (customerModel.getDefaultShipmentAddress() == null)
        {
            if (customerData.getDefaultShippingAddress() != null)
            {
                final AddressModel shipmentAddress = getModelService().create(AddressModel.class);
                getAddressReversePopulator().populate(customerData.getDefaultShippingAddress(), shipmentAddress);
                shipmentAddress.setOwner(customerModel);
                shipmentAddress.setAddressId(customerModel.getDefaultShipmentAddress().getAddressId());
                customerModel.setDefaultShipmentAddress(shipmentAddress);
            }
        }
        else
        {
            getAddressReversePopulator().populate(customerData.getDefaultShippingAddress(), customerModel.getDefaultShipmentAddress());
        }
    }
}
