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
 * The type Location Constraint.
*/
public class LocationConstraint extends ODataBaseEntity {

    public LocationConstraint(){
        setODataType("#Microsoft.OutlookServices.LocationConstraint");
    }

    private Boolean IsRequired;

    /**
    * Gets the Is Required.
    *
    * @return the Boolean
    */
    public Boolean getIsRequired() {
        return this.IsRequired; 
    }

    /**
    * Sets the Is Required.
    *
    * @param value the Boolean
    */
    public void setIsRequired(Boolean value) { 
        this.IsRequired = value;
        valueChanged("IsRequired", value);

    }

    private Boolean SuggestLocation;

    /**
    * Gets the Suggest Location.
    *
    * @return the Boolean
    */
    public Boolean getSuggestLocation() {
        return this.SuggestLocation; 
    }

    /**
    * Sets the Suggest Location.
    *
    * @param value the Boolean
    */
    public void setSuggestLocation(Boolean value) { 
        this.SuggestLocation = value;
        valueChanged("SuggestLocation", value);

    }

    private java.util.List<Location> Locations;

    /**
    * Gets the Locations.
    *
    * @return the java.util.List<Location>
    */
    public java.util.List<Location> getLocations() {
        return this.Locations; 
    }

    /**
    * Sets the Locations.
    *
    * @param value the java.util.List<Location>
    */
    public void setLocations(java.util.List<Location> value) { 
        this.Locations = value;
        valueChanged("Locations", value);

    }
}
