package awesome.customType;

import awesome.pojo.UserDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTable {
    @DataTableType
    public UserDetails userDetails(Map<String,String> entry)
    {
        return new UserDetails(
                entry.get("Password"),
                entry.get("FirstName"),
                entry.get("Lastname"),
                entry.get("Company"),
                entry.get("Address"),
                entry.get("State"),
                entry.get("City"),
                entry.get("Zipcode"),
                entry.get("MobileNumber"));
    }
}
