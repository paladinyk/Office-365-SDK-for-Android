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
package com.microsoft.onenote.api.orc;

import com.microsoft.onenote.api.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.*;
import com.microsoft.services.orc.Readable;
import com.microsoft.services.orc.interfaces.*;

/**
 * The type  SectionFetcher.
 */
public class SectionFetcher extends OrcEntityFetcher<Section,SectionOperations> 
                                     implements Readable<Section> {

     /**
     * Instantiates a new SectionFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public SectionFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Section.class, SectionOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SectionFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SectionFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

             /**
     * Gets parentnotebook.
     *
     * @return the parent notebook
     */
    public NotebookFetcher getParentNotebook() {
        return new NotebookFetcher("parentNotebook", this);
    }
     /**
     * Gets parentsectiongroup.
     *
     * @return the parent section group
     */
    public SectionGroupFetcher getParentSectionGroup() {
        return new SectionGroupFetcher("parentSectionGroup", this);
    }

     /**
     * Gets pages.
     *
     * @return the pages
     */
    public MultipartCollectionFetcher<Page, PageFetcher, PageCollectionOperations> getPages() {
        return new MultipartCollectionFetcher<Page, PageFetcher, PageCollectionOperations>("pages", this, Page.class, PageCollectionOperations.class);
    }

    /**
     * Gets page.
     *
     * @return the page
     */
    public PageFetcher getPage(String id){
         return new OrcCollectionFetcher<Page, PageFetcher, PageCollectionOperations>("pages", this, Page.class, PageCollectionOperations.class).getById(id);
    }

}
