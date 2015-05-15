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
package com.microsoft.graph.orc;

import com.microsoft.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.*;
import com.microsoft.services.orc.interfaces.*;
import static com.microsoft.services.orc.Helpers.*;

/**
 * The type DirectoryObjectOperations.
 */
public class DirectoryObjectOperations extends OrcOperations {

     /**
      * Instantiates a new DirectoryObjectOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public DirectoryObjectOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public DirectoryObjectOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public DirectoryObjectOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * checkMemberGroups listenable future.
     * @param groupIds the groupIds 
     * @return the listenable future
     */         
    public ListenableFuture<String> checkMemberGroups(java.util.List<String> groupIds) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedgroupIds = serializer.serialize(groupIds);
		  
        
        ListenableFuture<String> future = checkMemberGroupsRaw(serializedgroupIds);
        return transformToEntityListenableFuture(future, String.class, getResolver());
        
    }

     /**
     * checkMemberGroupsRaw listenable future.
     * @param groupIds the groupIds 
     * @return the listenable future
     */ 
    public ListenableFuture<String> checkMemberGroupsRaw(String groupIds){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("groupIds", groupIds);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.checkMemberGroups");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * getMemberGroups listenable future.
     * @param securityEnabledOnly the securityEnabledOnly 
     * @return the listenable future
     */         
    public ListenableFuture<String> getMemberGroups(Boolean securityEnabledOnly) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedsecurityEnabledOnly = serializer.serialize(securityEnabledOnly);
		  
        
        ListenableFuture<String> future = getMemberGroupsRaw(serializedsecurityEnabledOnly);
        return transformToEntityListenableFuture(future, String.class, getResolver());
        
    }

     /**
     * getMemberGroupsRaw listenable future.
     * @param securityEnabledOnly the securityEnabledOnly 
     * @return the listenable future
     */ 
    public ListenableFuture<String> getMemberGroupsRaw(String securityEnabledOnly){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("securityEnabledOnly", securityEnabledOnly);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.getMemberGroups");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * getMemberObjects listenable future.
     * @param securityEnabledOnly the securityEnabledOnly 
     * @return the listenable future
     */         
    public ListenableFuture<String> getMemberObjects(Boolean securityEnabledOnly) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedsecurityEnabledOnly = serializer.serialize(securityEnabledOnly);
		  
        
        ListenableFuture<String> future = getMemberObjectsRaw(serializedsecurityEnabledOnly);
        return transformToEntityListenableFuture(future, String.class, getResolver());
        
    }

     /**
     * getMemberObjectsRaw listenable future.
     * @param securityEnabledOnly the securityEnabledOnly 
     * @return the listenable future
     */ 
    public ListenableFuture<String> getMemberObjectsRaw(String securityEnabledOnly){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("securityEnabledOnly", securityEnabledOnly);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.getMemberObjects");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
