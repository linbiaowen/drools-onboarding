package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.plugin.model.Framework;

public class Marshaller_o_u_e_p_m_Framework_1_Impl implements GeneratedMarshaller<Framework> {
  private Framework[] EMPTY_ARRAY = new Framework[0];
  public Framework[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Framework demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    Framework entity = obj != null ? Enum.valueOf(Framework.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(Framework.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(Framework a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final StringBuilder json = new StringBuilder();
    return json.append(a0 != null ? new StringBuilder(64).append("{\"^EncodedType\":\"org.uberfire.ext.plugin.model.Framework\",\"^EnumStringValue\":\"").append(a0.name()).append("\"}") : "null").toString();
  }

  private void lazyInit() {

  }
}