#!/bin/bash
node expand.js ./swagger.json
./swagger2slate.phar convert swagger-expanded.json -o source/index.html.md
echo Converted to source/index.html.md
