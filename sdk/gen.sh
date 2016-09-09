#!/bin/bash

if [[ $# -eq 0 ]] ; then
    echo 'Please indicate the language you want for the SKD. E.g. $./gen.sh java'
    exit 0
fi

rm -fr $1
java -jar swagger-codegen-cli-2.2.1.jar generate -i ../swagger.json -l $1 -o gen-$1
