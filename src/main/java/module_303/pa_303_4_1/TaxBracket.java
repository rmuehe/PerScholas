package module_303.pa_303_4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaxBracket {
    double income;
    int status;

    // Read inputs for status and income
    void readTwoInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
        Enter your filing status number:
        1. Single
        2. Married Filing Jointly or Qualified Widow(er)
        3. Married Filing Separately
        4. Head of Household
        """);
        this.status = sc.nextInt();
        System.out.print("Enter your income: ");
        this.income = sc.nextDouble();
        sc.close();
    }

    // Check if income is within a given range
    private boolean isBetween(Double min, Double max, double test) {
        return test >= min && test <= max;
    }

    // Inner class to represent tax bracket ranges
    class TaxBracketRanges {
        double ten, fifteen, twenty5, twenty8, thirty3;
        String status;

        TaxBracketRanges(String status, double ten, double fifteen, double twenty5, double twenty8, double thirty3) {
            this.status = status;
            this.ten = ten;
            this.fifteen = fifteen;
            this.twenty5 = twenty5;
            this.twenty8 = twenty8;
            this.thirty3 = thirty3;
        }

        // Create a map of tax brackets for this status
        public Map<String, Double[]> taxBracketsByStatus() {
            Map<String, Double[]> resultMap = new HashMap<>();
            resultMap.put("10%", new Double[]{0.0, this.ten});
            resultMap.put("15%", new Double[]{this.ten + 1,  this.fifteen});
            resultMap.put("25%", new Double[]{this.fifteen + 1,  this.twenty5});
            resultMap.put("28%", new Double[]{this.twenty5 + 1,  this.twenty8});
            resultMap.put("33%", new Double[]{this.twenty8 + 1,  this.thirty3});
            resultMap.put("35%", new Double[]{this.thirty3 + 1, Double.POSITIVE_INFINITY});
            return resultMap;
        }
    }

    String determineTaxBracket() {
        TaxBracketRanges bracketRanges;
        switch (status) {
            case 1 -> bracketRanges = new TaxBracketRanges(
                    "Single",
                    8350,
                    33950,
                    82250,
                    171550,
                    372950);
            case 2 -> bracketRanges = new TaxBracketRanges(
                    "Married Filing Jointly",
                    16700,
                    67900,
                    137050,
                    208850,
                    372950);

            case 3 -> bracketRanges = new TaxBracketRanges(
                    "Married Filing Separately",
                    8350,
                    33950,
                    68525,
                    104425,
                    186475);
            case 4 -> bracketRanges = new TaxBracketRanges(
                    "Head of Household",
                    11950,
                    45500,
                    117450,
                    190200,
                    372950);
            default -> {
                return "Invalid status";
            }
        }

        Map<String, Double[]> brackets = bracketRanges.taxBracketsByStatus();
        for (Map.Entry<String, Double[]> entry : brackets.entrySet()) {
            Double[] range = entry.getValue();
            if (isBetween(range[0], range[1], income)) {
                return "For a status of " + bracketRanges.status + " and an income of $"
                        + String.format("%,.2f", income) + ", the tax bracket is " + entry.getKey();
            }
        }
        return "Tax bracket not found";
    }

    public static void main(String[] args) {
        TaxBracket taxBracket = new TaxBracket();
        taxBracket.readTwoInputs();
        String result = taxBracket.determineTaxBracket();
        System.out.println(result);
    }
}