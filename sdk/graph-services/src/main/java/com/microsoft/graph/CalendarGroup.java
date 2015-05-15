/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

/**
 * The type Calendar Group.
*/
public class CalendarGroup extends ODataBaseEntity {

    public CalendarGroup(){
        setODataType("#Microsoft.Graph.CalendarGroup");
    }
            
    private String Id;
     
    /**
    * Gets the Id.
    *
    * @return the String
    */
    public String getId() {
        return this.Id; 
    }

    /**
    * Sets the Id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.Id = value; 
    }
            
    private String Name;
     
    /**
    * Gets the Name.
    *
    * @return the String
    */
    public String getName() {
        return this.Name; 
    }

    /**
    * Sets the Name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.Name = value; 
    }
            
    private String ChangeKey;
     
    /**
    * Gets the Change Key.
    *
    * @return the String
    */
    public String getChangeKey() {
        return this.ChangeKey; 
    }

    /**
    * Sets the Change Key.
    *
    * @param value the String
    */
    public void setChangeKey(String value) { 
        this.ChangeKey = value; 
    }
            
    private java.util.UUID ClassId;
     
    /**
    * Gets the Class Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getClassId() {
        return this.ClassId; 
    }

    /**
    * Sets the Class Id.
    *
    * @param value the java.util.UUID
    */
    public void setClassId(java.util.UUID value) { 
        this.ClassId = value; 
    }
    
        
    private java.util.List<Calendar> Calendars = null;
    
    
     
    /**
    * Gets the Calendars.
    *
    * @return the java.util.List<Calendar>
    */
    public java.util.List<Calendar> getCalendars() {
        return this.Calendars; 
    }

    /**
    * Sets the Calendars.
    *
    * @param value the java.util.List<Calendar>
    */
    public void setCalendars(java.util.List<Calendar> value) { 
        this.Calendars = value; 
    }
}

