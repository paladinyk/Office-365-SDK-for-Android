/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.office365.odata.interfaces.*;
import com.microsoft.office365.exchange.services.*;

public class FolderFetcher extends ODataEntityFetcher<Folder,FolderOperations> implements Executable<Folder> {

	 public FolderFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Folder.class,FolderOperations.class);
    }
	public ODataCollectionFetcher<Folder, FolderFetcher, FolderCollectionOperations> getChildFolders() {
        return new ODataCollectionFetcher<Folder, FolderFetcher,FolderCollectionOperations>("ChildFolders", this, Folder.class,FolderCollectionOperations.class);
    }
	public ODataCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations> getMessages() {
        return new ODataCollectionFetcher<Message, MessageFetcher,MessageCollectionOperations>("Messages", this, Message.class,MessageCollectionOperations.class);
    }
}