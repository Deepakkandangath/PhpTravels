package utilities;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;

public class TestDataUtility {

    public static String getRandomUsername(){
        return new SecureRandom()
                .ints(10, 0, 26)
                .mapToObj(i -> String.valueOf((char) ('a' + i)))
                .collect(java.util.stream.Collectors.joining());
    }

    public static String getRandomEmailId(){
         return getRandomUsername()+"@"+getRandomUsername()+".com";
    }

    public static String getDynamicPhoneNumberByCountry(String regionCode){
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        SecureRandom random = new SecureRandom();
        int countryCode = phoneUtil.getCountryCodeForRegion(regionCode);

        if (countryCode == 0) {
            throw new IllegalArgumentException("Invalid country/region code: " + regionCode);
        }

        int nationalLength = String.valueOf(
                phoneUtil.getExampleNumber(regionCode).getNationalNumber()
        ).length();

        long min = (long) Math.pow(10, nationalLength - 1);
        long max = (long) Math.pow(10, nationalLength) - 1;
        long nationalNumber = min + (long) (random.nextDouble() * (max - min));

        Phonenumber.PhoneNumber number = new Phonenumber.PhoneNumber()
                .setCountryCode(countryCode)
                .setNationalNumber(nationalNumber);

        return phoneUtil.format(number, PhoneNumberUtil.PhoneNumberFormat.E164);
    }

    public static String getRandomCountryName(){
        String[] countries = Locale.getISOCountries();
        SecureRandom random = new SecureRandom();
        String code = countries[random.nextInt(countries.length)];
        Locale locale = new Locale.Builder()
                .setRegion(code)
                .build();

        return locale.getDisplayCountry(Locale.ENGLISH);
    }

    public static String getCountryCode(String countryName) {
        for (String iso : Locale.getISOCountries()) {

            Locale locale = new Locale.Builder()
                    .setRegion(iso)
                    .build();

            if (locale.getDisplayCountry(Locale.ENGLISH)
                    .equalsIgnoreCase(countryName)) {
                return iso;
            }
        }
        throw new IllegalArgumentException("Invalid country name: " + countryName);
    }
}
