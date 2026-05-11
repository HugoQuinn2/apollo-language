package io.github.hugoquinn2.core.file;

import java.util.List;

public class Xliff {

    private String version;
    private String xmlns;

    private File file;

    public static class File {

        private Body body;

        public static class Body {

            private List<TransUnit> transUnits;

            public static class TransUnit {

            }

        }

    }


}
