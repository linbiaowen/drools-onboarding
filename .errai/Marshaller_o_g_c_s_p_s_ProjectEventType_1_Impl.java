package org.jboss.errai.marshalling.client.api;

import org.guvnor.common.services.project.social.ProjectEventType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_g_c_s_p_s_ProjectEventType_1_Impl implements GeneratedMarshaller<ProjectEventType> {
  private ProjectEventType[] EMPTY_ARRAY = new ProjectEventType[0];
  public ProjectEventType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProjectEventType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    ProjectEventType entity = obj != null ? Enum.valueOf(ProjectEventType.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(ProjectEventType.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(ProjectEventType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final StringBuilder json = new StringBuilder();
    return json.append(a0 != null ? new StringBuilder(64).append("{\"^EncodedType\":\"org.guvnor.common.services.project.social.ProjectEventType\",\"^EnumStringValue\":\"").append(a0.name()).append("\"}") : "null").toString();
  }

  private void lazyInit() {

  }
}