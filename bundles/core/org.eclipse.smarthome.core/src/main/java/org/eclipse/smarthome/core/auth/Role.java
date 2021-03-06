/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.auth;

/**
 * Interface defining constants for roles within ESH.
 *
 * @author Kai Kreuzer - Initial contribution and API
 *
 */
public interface Role {

    /**
     * Role of users with administrative rights
     */
    final String ADMIN = "administrator";

    /**
     * Role of a regular user without any exceptional permissions or restrictions
     */
    final String USER = "user";

}
