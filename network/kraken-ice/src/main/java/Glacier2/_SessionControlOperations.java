// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Glacier2;

// <auto-generated>
//
// Generated from file `Session.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * An administrative session control object, which is tied to the
 * lifecycle of a {@link Session}.
 * 
 * @see Session
 * 
 **/
public interface _SessionControlOperations
{
    /**
     * Access the object that manages the allowable categories
     * for object identities for this session. 
     * 
     * @param __current The Current object for the invocation.
     * @return A StringSet object.
     * 
     **/
    StringSetPrx categories(Ice.Current __current);

    /**
     * Access the object that manages the allowable adapter identities
     * for objects for this session. 
     * 
     * @param __current The Current object for the invocation.
     * @return A StringSet object.
     * 
     **/
    StringSetPrx adapterIds(Ice.Current __current);

    /**
     * Access the object that manages the allowable object identities
     * for this session. 
     * 
     * @param __current The Current object for the invocation.
     * @return An IdentitySet object.
     * 
     **/
    IdentitySetPrx identities(Ice.Current __current);

    /**
     * Get the session timeout.
     * 
     * @param __current The Current object for the invocation.
     * @return The timeout.
     * 
     **/
    int getSessionTimeout(Ice.Current __current);

    /**
     * Destroy the associated session.
     * 
     * @param __current The Current object for the invocation.
     **/
    void destroy(Ice.Current __current);
}