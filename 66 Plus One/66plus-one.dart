class Solution {
  List<int> plusOne(List<int> digits) {
    String a = digits.join("");
    BigInt num = BigInt.parse(a);
    num+=BigInt.one;
    a = num.toString();
    List<int> res = a.split("").map(int.parse).toList();
    return res;
  }
}