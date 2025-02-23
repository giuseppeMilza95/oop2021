package com.company;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Currency;

public class APIConnector {
    public static String date = "2021-02-02";
    public static final String API_KEY = "lEHKQijwNSBoiEnAitSoiSilzJFZAI88lY6UI0kC";
    public static final String URL_ADDRESS = "https://freecurrencyapi.net/api/v2/latest?apikey="+API_KEY;
    //public static final String URL_ADDRESS = "https://api.currencyapi.com/v3/historical?apikey=" +API_KEY+  "&date=2021-02-02";
    //public static final String URL_ADDRESS = "https://api.currencyapi.com/v3/range?apikey="+API_KEY+"&datetime_start=2022-04-01T23:59:59Z&datetime_end=2022-04-02T23:59:59Z";
    //public static final String URL_ADDRESS = "https://api.currencyapi.com/v3/latest?apikey=" + API_KEY + "&base_currency=USD";

    public String getCurrencyData() throws  Exception{


            URL urlForGetRequest = new URL(URL_ADDRESS);
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            int responseCode = conection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
                System.out.println(response.toString());
                return response.toString();
            } else {
                throw new Exception("Error in API Call");
            }
    }

    public void getCurrency(String currencyString){
        JSONTokener tokener = new JSONTokener(currencyString);
        JSONObject jsonCurrency = new JSONObject(tokener);

        System.out.println(jsonCurrency.getJSONObject("data").getDouble("PLN"));


    }

    public void exchangeToPln(double amount,double price, String currencyString){
        JSONTokener tokener = new JSONTokener(currencyString);
        JSONObject jsonCurrency = new JSONObject(tokener);
        double currentValue = jsonCurrency.getJSONObject("data").getDouble("PLN");
        if ((amount * price) > (amount * currentValue)){
            System.out.println("This is not the right moment to sell the usd, the current value of pln is: "  + currentValue  );
        }else{
            System.out.println("This is the best moment to sell USD and buy PLN, current PLN value is: " + currentValue);
        }


    }


    public void exchangeToPlnDate(String date, double amount){



    }


    }

