package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import org.guvnor.asset.management.social.ProjectDeployedEvent;
import org.guvnor.asset.management.social.ProjectDeployedEvent.DeployType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_g_a_m_s_ProjectDeployedEvent_1_Impl implements GeneratedMarshaller<ProjectDeployedEvent> {
  private ProjectDeployedEvent[] EMPTY_ARRAY = new ProjectDeployedEvent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<DeployType> org_guvnor_asset_management_social_ProjectDeployedEvent_erraiD_DeployType = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public ProjectDeployedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProjectDeployedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ProjectDeployedEvent.class, objId);
    }
    ProjectDeployedEvent entity = new ProjectDeployedEvent();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("projectName")) && (!obj.get("projectName").isNull())) {
      entity.setProjectName(java_lang_String.demarshall(obj.get("projectName"), a1));
    }
    if ((obj.containsKey("groupId")) && (!obj.get("groupId").isNull())) {
      entity.setGroupId(java_lang_String.demarshall(obj.get("groupId"), a1));
    }
    if ((obj.containsKey("artifactId")) && (!obj.get("artifactId").isNull())) {
      entity.setArtifactId(java_lang_String.demarshall(obj.get("artifactId"), a1));
    }
    if ((obj.containsKey("version")) && (!obj.get("version").isNull())) {
      entity.setVersion(java_lang_String.demarshall(obj.get("version"), a1));
    }
    if ((obj.containsKey("executionServer")) && (!obj.get("executionServer").isNull())) {
      entity.setExecutionServer(java_lang_String.demarshall(obj.get("executionServer"), a1));
    }
    if ((obj.containsKey("deployType")) && (!obj.get("deployType").isNull())) {
      entity.setDeployType(obj.get("deployType").isObject() != null ? Enum.valueOf(DeployType.class, obj.get("deployType").isObject().get("^EnumStringValue").isString().stringValue()) : obj.get("deployType").isString() != null ? Enum.valueOf(DeployType.class, obj.get("deployType").isString().stringValue()) : null);
    }
    if ((obj.containsKey("processName")) && (!obj.get("processName").isNull())) {
      entity.setProcessName(java_lang_String.demarshall(obj.get("processName"), a1));
    }
    if ((obj.containsKey("user")) && (!obj.get("user").isNull())) {
      entity.setUser(java_lang_String.demarshall(obj.get("user"), a1));
    }
    if ((obj.containsKey("repositoryAlias")) && (!obj.get("repositoryAlias").isNull())) {
      entity.setRepositoryAlias(java_lang_String.demarshall(obj.get("repositoryAlias"), a1));
    }
    if ((obj.containsKey("rootURI")) && (!obj.get("rootURI").isNull())) {
      entity.setRootURI(java_lang_String.demarshall(obj.get("rootURI"), a1));
    }
    if ((obj.containsKey("timestamp")) && (!obj.get("timestamp").isNull())) {
      entity.setTimestamp(java_lang_Long.demarshall(obj.get("timestamp"), a1));
    }
    if ((obj.containsKey("params")) && (!obj.get("params").isNull())) {
      a1.setAssumedMapKeyType("java.lang.String");
      a1.setAssumedMapValueType("java.lang.String");
      entity.setParams(java_util_Map.demarshall(obj.get("params"), a1));
      a1.resetAssumedTypes();
    }
    if ((obj.containsKey("errors")) && (!obj.get("errors").isNull())) {
      a1.setAssumedElementType("java.lang.String");
      entity.setErrors(java_util_List.demarshall(obj.get("errors"), a1));
    }
    return entity;
  }

  public String marshall(ProjectDeployedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"org.guvnor.asset.management.social.ProjectDeployedEvent\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"projectName\":").append(java_lang_String.marshall(a0.getProjectName(), a1)).append(",").append("\"groupId\":").append(java_lang_String.marshall(a0.getGroupId(), a1)).append(",").append("\"artifactId\":").append(java_lang_String.marshall(a0.getArtifactId(), a1)).append(",").append("\"version\":").append(java_lang_String.marshall(a0.getVersion(), a1)).append(",").append("\"executionServer\":").append(java_lang_String.marshall(a0.getExecutionServer(), a1)).append(",").append("\"deployType\":").append(a0.getDeployType() != null ? new StringBuilder(64).append("{\"^EncodedType\":\"org.guvnor.asset.management.social.ProjectDeployedEvent$DeployType\",\"^EnumStringValue\":\"").append(a0.getDeployType().name()).append("\"}") : "null").append(",").append("\"processName\":").append(java_lang_String.marshall(a0.getProcessName(), a1)).append(",").append("\"user\":").append(java_lang_String.marshall(a0.getUser(), a1)).append(",").append("\"repositoryAlias\":").append(java_lang_String.marshall(a0.getRepositoryAlias(), a1)).append(",").append("\"rootURI\":").append(java_lang_String.marshall(a0.getRootURI(), a1)).append(",").append("\"timestamp\":").append(java_lang_Long.marshall(a0.getTimestamp(), a1)).append(",").append("\"params\":").append(java_util_Map.marshall(a0.getParams(), a1)).append(",").append("\"errors\":").append(java_util_List.marshall(a0.getErrors(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (org_guvnor_asset_management_social_ProjectDeployedEvent_erraiD_DeployType == null) {
      org_guvnor_asset_management_social_ProjectDeployedEvent_erraiD_DeployType = Marshalling.getMarshaller(DeployType.class);
    }
  }
}