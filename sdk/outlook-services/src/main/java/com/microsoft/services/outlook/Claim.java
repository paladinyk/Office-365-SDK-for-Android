/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook;

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Claim.
*/
public class Claim extends ODataBaseEntity {

    public Claim(){
        setODataType("#Microsoft.OutlookServices.Claim");
    }

    private String Type;

    /**
    * Gets the Type.
    *
    * @return the String
    */
    public String getType() {
        return this.Type; 
    }

    /**
    * Sets the Type.
    *
    * @param value the String
    */
    public void setType(String value) { 
        this.Type = value;
        valueChanged("Type", value);

    }

    private String Value;

    /**
    * Gets the Value.
    *
    * @return the String
    */
    public String getValue() {
        return this.Value; 
    }

    /**
    * Sets the Value.
    *
    * @param value the String
    */
    public void setValue(String value) { 
        this.Value = value;
        valueChanged("Value", value);

    }

    private String ValueType;

    /**
    * Gets the Value Type.
    *
    * @return the String
    */
    public String getValueType() {
        return this.ValueType; 
    }

    /**
    * Sets the Value Type.
    *
    * @param value the String
    */
    public void setValueType(String value) { 
        this.ValueType = value;
        valueChanged("ValueType", value);

    }

    private String OriginalIssuer;

    /**
    * Gets the Original Issuer.
    *
    * @return the String
    */
    public String getOriginalIssuer() {
        return this.OriginalIssuer; 
    }

    /**
    * Sets the Original Issuer.
    *
    * @param value the String
    */
    public void setOriginalIssuer(String value) { 
        this.OriginalIssuer = value;
        valueChanged("OriginalIssuer", value);

    }
}
