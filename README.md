# Navitia-Android

Android api for Navitia

# Example

        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair("from", "-1.660645;48.127088"));
        pairs.add(new Pair("to", "-1.673421;48.112963"));
        pairs.add(new Pair("datetime", "20150826T0800"));

        Request.getWays(new Action<Way>() {

                            @Override
                            public void action(Way e) {
                                Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                            }

                        }, pairs);

# License

This library is distributed under the Apache 2.0 license found in the LICENSE file.
