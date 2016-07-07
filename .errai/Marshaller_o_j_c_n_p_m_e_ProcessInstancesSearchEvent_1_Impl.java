package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jbpm.console.ng.pr.model.events.ProcessInstancesSearchEvent;

public class Marshaller_o_j_c_n_p_m_e_ProcessInstancesSearchEvent_1_Impl implements GeneratedMarshaller<ProcessInstancesSearchEvent> {
  private ProcessInstancesSearchEvent[] EMPTY_ARRAY = new ProcessInstancesSearchEvent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public ProcessInstancesSearchEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProcessInstancesSearchEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ProcessInstancesSearchEvent.class, objId);
    }
    ProcessInstancesSearchEvent entity = new ProcessInstancesSearchEvent();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("filter")) && (!obj.get("filter").isNull())) {
      entity.setFilter(java_lang_String.demarshall(obj.get("filter"), a1));
    }
    return entity;
  }

  public String marshall(ProcessInstancesSearchEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"org.jbpm.console.ng.pr.model.events.ProcessInstancesSearchEvent\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"filter\":").append(java_lang_String.marshall(a0.getFilter(), a1)).append("}").toString();
  }

  private void lazyInit() {

  }
}