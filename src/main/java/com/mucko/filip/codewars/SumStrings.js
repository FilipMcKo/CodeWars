function sumStrings(a, b) {
  var c = a.toString();
  var d = b.toString();
  if (c.length > d.length) {
    while (c.length > d.length) {
      d = '0' + d;
    }
  }
  if (d.length > c.length) {
    while (d.length > c.length) {
      c = '0' + c;
    }
  }
  c = '0' + c;
  d = '0' + d;
  var remainder = 0;
  var result = '';
  var digit;
  for (var i = c.length - 1; i >= 0; i--) {
    digit = Number(c.charAt(i)) + Number(d.charAt(i));
    if (remainder > 0) {
      digit += remainder;
    }
    if (digit > 9) {
      digit -= 10;
      remainder = 1;
    } else {
      remainder = 0;
    }
    result = digit.toString() + result;
  }
  while (result.charAt(0) === '0') {
    result = result.substring(1, result.length);
  }

  return result;
}

sumStrings(99424, 134);
sumStrings(324, 1342);