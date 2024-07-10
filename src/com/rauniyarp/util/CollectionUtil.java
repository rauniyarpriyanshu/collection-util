package com.rauniyarp.util;

import java.util.*;

/**
 * <p>This is utility class for Java collection framework especially designed for
 * sorting HashMap, LinkedHashMap,TreeMap, HashSet and LinkedHashSet this class allow you to sort map based on key and
 * value with order Natural-Ascending and Reverse-Descending. I hope this utility class will make your work easy while
 * dealing with maps
 * </p>
 *
 * @author Priyanshu Rauniyar
 * @version 1.0 - support Maps sorting based on key and value
 * @see CollectionUtil#sortedHashMap_ByKey(Map, ORDER)#sortedHashMap_ByValue(Map, ORDER)
 * @see CollectionUtil#sortedLinkedHashMap_ByKey(Map, ORDER)#sortedLinkedHashMap_ByKey(Map, ORDER)
 * @see CollectionUtil#sortedTreeMap_ByKey(Map, ORDER)#sortedTreeMap_ByValue(Map, ORDER)
 * @since 2024
 */
public class CollectionUtil {

    /**
     * <p>This methods allow you to return sorted {@link HashMap} by value </p>
     * <p>To use this method, Create a {@link HashMap}  with some keys and value
     * after that call this method
     * </p>
     *
     * @param map          your old {@link HashMap}  instance
     * @param sortingOrder { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see HashMap
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <K, V extends Comparable<V>, T extends Map<K, V>> HashMap<K, V> sortedHashMap_ByValue(T map, ORDER sortingOrder) {
        List<Map.Entry<K, V>> data = new ArrayList<>(map.entrySet());
        data.sort((entry1, entry2) -> {
            if (sortingOrder.equals(ORDER.NORMAL)) {
                if (entry1.getValue() instanceof String) {
                    return ((String) entry1.getValue()).toUpperCase().compareTo(((String) entry2.getValue()).toUpperCase());
                } else {
                    return entry1.getValue().compareTo(entry2.getValue());
                }
            } else {
                if (entry2.getValue() instanceof String) {
                    return ((String) entry2.getValue()).toUpperCase().compareTo(((String) entry1.getValue()).toUpperCase());
                } else {
                    return entry2.getValue().compareTo(entry1.getValue());
                }
            }
        });
        HashMap<K, V> hashMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : data) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        data = null; //Let GC to its work by removing waste
        return hashMap;
    }

    /**
     * <p>This methods allow you to return sorted {@link HashMap} by Key </p>
     * <p>To use this method, Create a {@link HashMap} with some keys and value
     * after that call this method
     * </p>
     *
     * @param map          your {@link HashMap}  instance
     * @param sortingOrder { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see HashMap
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <K extends Comparable<K>, V, T extends Map<K, V>> HashMap<K, V> sortedHashMap_ByKey(T map, ORDER sortingOrder) {
        List<Map.Entry<K, V>> data = new ArrayList<>(map.entrySet());
        data.sort((entry1, entry2) -> {
            if (sortingOrder.equals(ORDER.NORMAL)) {
                if (entry1.getKey() instanceof String) {
                    return ((String) entry1.getKey()).toUpperCase().compareTo(((String) entry2.getKey()).toUpperCase());
                } else {
                    return entry1.getKey().compareTo(entry2.getKey());
                }
            } else {
                if (entry2.getKey() instanceof String) {
                    return ((String) entry2.getKey()).toUpperCase().compareTo(((String) entry1.getKey()).toUpperCase());
                } else {
                    return entry2.getKey().compareTo(entry1.getKey());
                }
            }
        });
        HashMap<K, V> hashMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : data) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        data = null; //Let GC to its work by removing waste
        return hashMap;
    }

    /**
     * <p>This methods allow you to return sorted {@link LinkedHashMap} by value </p>
     * <p>To use this method, Create a {@link LinkedHashMap} with some keys and value
     * after that call this method
     * </p>
     *
     * @param map          your old {@link LinkedHashMap} instance
     * @param sortingOrder { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <K, V extends Comparable<V>, T extends Map<K, V>> LinkedHashMap<K, V> sortedLinkedHashMap_ByValue(T map, ORDER sortingOrder) {
        List<Map.Entry<K, V>> data = new ArrayList<>(map.entrySet());
        data.sort((entry1, entry2) -> {
            if (sortingOrder.equals(ORDER.NORMAL)) {
                if (entry1.getValue() instanceof String) {
                    return ((String) entry1.getValue()).toUpperCase().compareTo(((String) entry2.getValue()).toUpperCase());
                } else {
                    return entry1.getValue().compareTo(entry2.getValue());
                }
            } else {
                if (entry2.getValue() instanceof String) {
                    return ((String) entry2.getValue()).toUpperCase().compareTo(((String) entry1.getValue()).toUpperCase());
                } else {
                    return entry2.getValue().compareTo(entry1.getValue());
                }
            }
        });
        LinkedHashMap<K, V> hashMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : data) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        data = null; //Let GC to its work by removing waste
        return hashMap;
    }

    /**
     * <p>This methods allow you to return sorted {@link LinkedHashMap} by Key </p>
     * <p>To use this method, Create a {@link LinkedHashMap} with some keys and value
     * after that call this method
     * </p>
     *
     * @param map          your old {@link LinkedHashMap} instance
     * @param sortingOrder { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <K extends Comparable<K>, V, T extends Map<K, V>> LinkedHashMap<K, V> sortedLinkedHashMap_ByKey(T map, ORDER sortingOrder) {
        List<Map.Entry<K, V>> data = new ArrayList<>(map.entrySet());
        data.sort((entry1, entry2) -> {
            if (sortingOrder.equals(ORDER.NORMAL)) {
                if (entry1.getKey() instanceof String) {
                    return ((String) entry1.getKey()).toUpperCase().compareTo(((String) entry2.getKey()).toUpperCase());
                } else {
                    return entry1.getKey().compareTo(entry2.getKey());
                }
            } else {
                if (entry2.getKey() instanceof String) {
                    return ((String) entry2.getKey()).toUpperCase().compareTo(((String) entry1.getKey()).toUpperCase());
                } else {
                    return entry2.getKey().compareTo(entry1.getKey());
                }
            }
        });
        LinkedHashMap<K, V> hashMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : data) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        data = null; //Let GC to its work by removing waste
        return hashMap;
    }

    /**
     * <p>This methods allow you to return sorted {@link TreeMap} by value </p>
     * <p>To use this method, Create a {@link TreeMap} with some keys and value
     * after that call this method
     * </p>
     *
     * @param map          your old {@link TreeMap} instance
     * @param sortingOrder { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <K, V extends Comparable<V>, T extends Map<K, V>> TreeMap<K, V> sortedTreeMap_ByValue(T map, ORDER sortingOrder) {
        Comparator<K> comparator = new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {
                if (sortingOrder.equals(ORDER.NORMAL)) {
                    if (map.get(o1) instanceof String) {
                        if (((String) map.get(o1)).compareToIgnoreCase((String) map.get(o2)) >= 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    } else {
                        if (map.get(o1).compareTo(map.get(o2)) >= 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                } else {
                    if (map.get(o2) instanceof String) {
                        if (((String) map.get(o2)).compareToIgnoreCase(((String) map.get(o1))) >= 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    } else {
                        if (map.get(o2).compareTo(map.get(o1)) >= 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
            }
        };
        TreeMap<K, V> sortedTreeMap = new TreeMap<>(comparator);
        sortedTreeMap.putAll(map);
        return sortedTreeMap;
    }

    /**
     * <p>This methods allow you to return sorted {@link TreeMap} by Key </p>
     * <p>To use this method, Create a {@link TreeMap} with some keys and value
     * after that call this method
     * </p>
     *
     * @param map          your old {@link TreeMap} instance
     * @param sortingOrder { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <K extends Comparable<K>, V, T extends Map<K, V>> TreeMap<K, V> sortedTreeMap_ByKey(T map, ORDER sortingOrder) {
        TreeMap<K, V> sortedMap;
        if (sortingOrder.equals(ORDER.REVERSE)) {
            sortedMap = new TreeMap<>(Comparator.reverseOrder());
            sortedMap.putAll(map);
        } else {
            sortedMap = new TreeMap<>(map);
        }
        return sortedMap;
    }


 

    /**
     * <p>This methods allow you to return sorted {@link HashSet} </p>
     * <p>To use this method, Create a {@link HashSet} with elements
     * after that call this method
     * </p>
     *
     * @param set   your old {@link HashSet} instance
     * @param order { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <T extends Set<E>, E extends Comparable<E>> HashSet<E> getSortedHashSet(T set, ORDER order) {
        List<E> setData = new ArrayList<>(set);
        setData.sort(new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                if (order.equals(ORDER.NORMAL)) {
                    if (o1 instanceof String) {
                        return ((String) o1).compareToIgnoreCase((String) o2);
                    } else {
                        return o1.compareTo(o2);
                    }
                } else {
                    if (o2 instanceof String) {
                        return ((String) o2).compareToIgnoreCase((String) o1);
                    } else {
                        return o2.compareTo(o1);
                    }
                }
            }
        });
        HashSet<E> sets = new LinkedHashSet<>(setData);
        //  sets.addAll(setData);
        setData = null; //free for garbage colleection

        return sets;
    }

    /**
     * <p>This methods allow you to return sorted {@link LinkedHashSet} </p>
     * <p>To use this method, Create a {@link LinkedHashSet} with elements
     * after that call this method
     * </p>
     *
     * @param set   your old {@link LinkedHashSet} instance
     * @param order { ORDER.NORMAL = Ascending Order, ORDER.REVERSE= Descending Order}
     * @see ORDER#NORMAL
     * @see ORDER#REVERSE
     */
    public static <T extends Set<E>, E extends Comparable<E>> LinkedHashSet<E> getSortedLinkedHashSet(T set, ORDER order) {
        List<E> setData = new ArrayList<>(set);
        setData.sort(new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                if (order.equals(ORDER.NORMAL)) {
                    if (o1 instanceof String) {
                        return ((String) o1).compareToIgnoreCase((String) o2);
                    } else {
                        return o1.compareTo(o2);
                    }
                } else {
                    if (o2 instanceof String) {
                        return ((String) o2).compareToIgnoreCase((String) o1);
                    } else {
                        return o2.compareTo(o1);
                    }
                }
            }
        });
        LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>(setData);
        setData = null;//let garbage collector do its work
        return linkedHashSet;
    }

    public enum ORDER {
        REVERSE,
        NORMAL
    }

}
