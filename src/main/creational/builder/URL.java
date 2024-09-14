package creational.builder;

public class URL {
    private final String protocol;
    private final String domain;

    private final String path;
    private final String query;
    private final String fragment;

    private URL(Builder builder) {
        this.protocol = builder.protocol;
        this.domain = builder.domain;
        this.path = builder.path;
        this.query = builder.query;
        this.fragment = builder.fragment;
    }

    @Override
    public String toString() {
        StringBuilder url = new StringBuilder();
        url.append(protocol).append("://").append(domain);

        if (!path.isEmpty()) {
            url.append("/").append(path);
        }
        if (!query.isEmpty()) {
            url.append("?").append(query);
        }
        if (!fragment.isEmpty()) {
            url.append("#").append(fragment);
        }

        return url.toString();
    }

    public static class Builder {
        private final String protocol;
        private final String domain;

        private String path;
        private String query;
        private String fragment;

        public Builder(String protocol, String domain) {
            this.protocol = protocol;
            this.domain = domain;

            this.path = "";
            this.query = "";
            this.fragment = "";
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setFragment(String fragment) {
            this.fragment = fragment;
            return this;
        }

        public URL build() {
            return new URL(this);
        }
    }
}

