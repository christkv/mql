NODE = node
LANGUAGE = deps/language/bin/language
PEGJS = node_modules/pegjs/bin/pegjs
NODEUNIT = node_modules/nodeunit/bin/nodeunit
name = all

total: build_all

test_all:
	$(NODEUNIT) test/

build_all:
	# $(PEGJS) parser/mql.language lib/mql-parser.js
	$(LANGUAGE) -g parser/mql.language -o lib/mql-parser.js
	# $(LANGUAGE) -g parser/t.language -o lib/mql-parser.js
	$(NODEUNIT) test/

.PHONY: total