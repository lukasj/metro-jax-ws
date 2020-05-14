/*
 * Copyright (c) 1997, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.sdo.sample.service.types;

import commonj.sdo.Type;
import commonj.sdo.impl.HelperProvider;
import org.eclipse.persistence.sdo.SDODataObject;

public class FindDeptsElementImpl extends SDODataObject implements FindDeptsElement {

   public static String SDO_URI = "http://sdo.sample.service/types/";

   public FindDeptsElementImpl() {}

//   public Type getType() {
//      if(type == null){
//         Type lookupType = HelperProvider.getTypeHelper().getType(SDO_URI, "FindDeptsElement");
//         setType(lookupType);
//      }
//      return type;
//   }

   public com.sun.xml.ws.sdo.sample.service.types.FindCriteria getFindCriteria() {
      return (com.sun.xml.ws.sdo.sample.service.types.FindCriteria)get("findCriteria");
   }

   public void setFindCriteria(com.sun.xml.ws.sdo.sample.service.types.FindCriteria value) {
      set("findCriteria" , value);
   }

   public com.sun.xml.ws.sdo.sample.service.types.FindControl getFindControl() {
      return (com.sun.xml.ws.sdo.sample.service.types.FindControl)get("findControl");
   }

   public void setFindControl(com.sun.xml.ws.sdo.sample.service.types.FindControl value) {
      set("findControl" , value);
   }


}
