package cafeteria.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonFormatter {
	// Implementação do formatador JSON
	    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    
	    public static String formatJson(Object object) {
	        return gson.toJson(object);
	    }
}