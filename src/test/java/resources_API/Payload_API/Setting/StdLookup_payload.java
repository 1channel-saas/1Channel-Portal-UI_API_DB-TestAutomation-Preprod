package resources_API.Payload_API.Setting;

import pojo_API.RequestPojo.Setting.StdLookup_pojo;
import utilities_API.GetProperty_API;

public class StdLookup_payload {

    public StdLookup_pojo stdLookupPayload() {
        StdLookup_pojo stdLookup_pojo = new StdLookup_pojo();
        stdLookup_pojo.setId(Integer.parseInt(GetProperty_API.value("getStdLookupForAttributeTypes_id")));
        stdLookup_pojo.setTypename(GetProperty_API.value("getStdLookupForAttributeTypes_typename")  );
        return stdLookup_pojo;
    }

}
