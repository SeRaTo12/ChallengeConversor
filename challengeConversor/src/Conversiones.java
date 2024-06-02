import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
public class Conversiones {

    public static void solicitud(String url_str, int cantidad) throws IOException, InterruptedException {
        //Making Request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url_str))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        Moneda moneda = gson.fromJson(json, Moneda.class);
        moneda.datos(cantidad);
    }
}
