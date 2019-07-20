package CodeWars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ObservedPin {

    public static List<String> getPINs(String observed) {
        Integer digit;
        List<List<Integer>> integers = new ArrayList<>();
        for (int i = 0; i < observed.length(); i++) {
            digit = Character.getNumericValue(observed.charAt(i));
            integers.add(new LinkedList<>());
            integers.get(i).add(digit);
        }

        for (List<Integer> integer : integers) {
            addPossibleDigits(integer);
        }

        List<String> results = new ArrayList<>();
        addPossibleSolutions(results, integers, integers.size());
        return results;
    }

    private static void addPossibleSolutions(List<String> results, List<List<Integer>> integers, int depth) {

        //perhaps recursion would be better

        switch (integers.size()) {
            case 1:
                for (Integer integer : integers.get(0)) {
                    results.add(integer.toString());
                }
                break;

            case 2:
                for (int i = 0; i < integers.get(0).size(); i++) {
                    for (int i1 = 0; i1 < integers.get(1).size(); i1++) {
                        results.add(integers.get(0).get(i).toString() + integers.get(1).get(i1).toString());
                    }
                }
                break;

            case 3:
                for (int i = 0; i < integers.get(0).size(); i++) {
                    for (int i1 = 0; i1 < integers.get(1).size(); i1++) {
                        for (int i2 = 0; i2 < integers.get(2).size(); i2++) {
                            results.add(integers.get(0).get(i).toString()
                                    + integers.get(1).get(i1).toString()
                                    + integers.get(2).get(i2).toString());
                        }
                    }
                }
                break;

            case 4:
                for (int i = 0; i < integers.get(0).size(); i++) {
                    for (int i1 = 0; i1 < integers.get(1).size(); i1++) {
                        for (int i2 = 0; i2 < integers.get(2).size(); i2++) {
                            for (int i3 = 0; i3 < integers.get(3).size(); i3++) {
                                results.add(integers.get(0).get(i).toString()
                                        + integers.get(1).get(i1).toString()
                                        + integers.get(2).get(i2).toString()
                                        + integers.get(3).get(i3).toString());
                            }
                        }
                    }
                }
                break;

            case 5:
                for (int i = 0; i < integers.get(0).size(); i++) {
                    for (int i1 = 0; i1 < integers.get(1).size(); i1++) {
                        for (int i2 = 0; i2 < integers.get(2).size(); i2++) {
                            for (int i3 = 0; i3 < integers.get(3).size(); i3++) {
                                for (int i4 = 0; i4 < integers.get(4).size(); i4++) {
                                    results.add(integers.get(0).get(i).toString()
                                            + integers.get(1).get(i1).toString()
                                            + integers.get(2).get(i2).toString()
                                            + integers.get(3).get(i3).toString()
                                            + integers.get(4).get(i4).toString());
                                }
                            }
                        }
                    }
                }
                break;

            case 6:
                for (int i = 0; i < integers.get(0).size(); i++) {
                    for (int i1 = 0; i1 < integers.get(1).size(); i1++) {
                        for (int i2 = 0; i2 < integers.get(2).size(); i2++) {
                            for (int i3 = 0; i3 < integers.get(3).size(); i3++) {
                                for (int i4 = 0; i4 < integers.get(4).size(); i4++) {
                                    for (int i5 = 0; i5 < integers.get(5).size(); i5++) {
                                        results.add(integers.get(0).get(i).toString()
                                                + integers.get(1).get(i1).toString()
                                                + integers.get(2).get(i2).toString()
                                                + integers.get(3).get(i3).toString()
                                                + integers.get(4).get(i4).toString()
                                                + integers.get(5).get(i5).toString());
                                    }
                                    }
                            }
                        }
                    }
                }
                break;

            case 7:
                for (int i = 0; i < integers.get(0).size(); i++) {
                    for (int i1 = 0; i1 < integers.get(1).size(); i1++) {
                        for (int i2 = 0; i2 < integers.get(2).size(); i2++) {
                            for (int i3 = 0; i3 < integers.get(3).size(); i3++) {
                                for (int i4 = 0; i4 < integers.get(4).size(); i4++) {
                                    for (int i5 = 0; i5 < integers.get(5).size(); i5++) {
                                        for (int i6 = 0; i6 < integers.get(6).size(); i6++) {
                                            results.add(integers.get(0).get(i).toString()
                                                    + integers.get(1).get(i1).toString()
                                                    + integers.get(2).get(i2).toString()
                                                    + integers.get(3).get(i3).toString()
                                                    + integers.get(4).get(i4).toString()
                                                    + integers.get(5).get(i5).toString()
                                                    + integers.get(6).get(i6).toString());
                                        }
                                        }
                                }
                            }
                        }
                    }
                }
                break;

            case 8:
                for (int i = 0; i < integers.get(0).size(); i++) {
                    for (int i1 = 0; i1 < integers.get(1).size(); i1++) {
                        for (int i2 = 0; i2 < integers.get(2).size(); i2++) {
                            for (int i3 = 0; i3 < integers.get(3).size(); i3++) {
                                for (int i4 = 0; i4 < integers.get(4).size(); i4++) {
                                    for (int i5 = 0; i5 < integers.get(5).size(); i5++) {
                                        for (int i6 = 0; i6 < integers.get(6).size(); i6++) {
                                            for (int i7 = 0; i7 < integers.get(7).size(); i7++) {
                                                results.add(integers.get(0).get(i).toString()
                                                        + integers.get(1).get(i1).toString()
                                                        + integers.get(2).get(i2).toString()
                                                        + integers.get(3).get(i3).toString()
                                                        + integers.get(4).get(i4).toString()
                                                        + integers.get(5).get(i5).toString()
                                                        + integers.get(6).get(i6).toString()
                                                        + integers.get(7).get(i7).toString());

                                            }
                                            }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }


    private static void addPossibleDigits(List<Integer> integer) {
        switch (integer.get(0)) {
            case 0:
                integer.add(8);
                break;
            case 1:
                integer.add(2);
                integer.add(4);
                break;
            case 2:
                integer.add(1);
                integer.add(3);
                integer.add(5);
                break;
            case 3:
                integer.add(2);
                integer.add(6);
                break;
            case 4:
                integer.add(1);
                integer.add(7);
                integer.add(5);
                break;
            case 5:
                integer.add(2);
                integer.add(4);
                integer.add(6);
                integer.add(8);
                break;
            case 6:
                integer.add(3);
                integer.add(5);
                integer.add(9);
                break;
            case 7:
                integer.add(4);
                integer.add(8);
                break;
            case 8:
                integer.add(5);
                integer.add(7);
                integer.add(9);
                integer.add(0);
                break;
            case 9:
                integer.add(6);
                integer.add(8);
                break;
        }
    }


}
