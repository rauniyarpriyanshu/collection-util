# collection-util
 Java collection util library for Map and Set interface class
 Sample Code Implementation
 ```
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "B");
        hashMap.put(2, "b");
        hashMap.put(3, "A");
        hashMap.put(4, "c");
        hashMap.put(8, "A");
        hashMap.put(9, "C");
        hashMap.put(10, "a");
        hashMap.put(7, "C");
        hashMap = CollectionUtil.sortedHashMap_ByValue(hashMap, ORDER.NORMAL);
        System.out.println(hashMap);
        hashMap = CollectionUtil.sortedHashMap_ByKey(hashMap, ORDER.REVERSE);
        System.out.println(hashMap);
        System.out.println("LinkedHashMap");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "B");
        linkedHashMap.put(2, "b");
        linkedHashMap.put(3, "A");
        linkedHashMap.put(4, "c");
        linkedHashMap.put(8, "A");
        linkedHashMap.put(9, "C");
        linkedHashMap.put(10, "a");
        linkedHashMap.put(7, "C");
        linkedHashMap = CollectionUtil.sortedLinkedHashMap_ByKey(linkedHashMap, ORDER.REVERSE);
        System.out.println(linkedHashMap);
        linkedHashMap = CollectionUtil.sortedLinkedHashMap_ByValue(linkedHashMap, ORDER.NORMAL);
        System.out.println(linkedHashMap);
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "B");
        treeMap.put(2, "b");
        treeMap.put(3, "A");
        treeMap.put(4, "C");
        treeMap.put(8, "A");
        treeMap.put(9, "C");
        treeMap.put(10, "a");
        treeMap.put(7, "c");
        treeMap = CollectionUtil.sortedTreeMap_ByValue(treeMap, ORDER.NORMAL);
        System.out.println("TreeMap:");
        System.out.println(treeMap);
        treeMap = CollectionUtil.sortedTreeMap_ByKey(treeMap, ORDER.REVERSE);
        System.out.println(treeMap);
        System.out.println("Set");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("b");
        hashSet.add("a");
        hashSet.add("B");
        hashSet.add("c");
        hashSet = CollectionUtil.getSortedHashSet(hashSet, ORDER.REVERSE);
        System.out.println(hashSet);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("C");
        linkedHashSet.add("b");
        linkedHashSet.add("a");
        linkedHashSet.add("B");
        linkedHashSet.add("c");
        linkedHashSet=CollectionUtil.getSortedLinkedHashSet(linkedHashSet,ORDER.REVERSE);
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);
    }
```
