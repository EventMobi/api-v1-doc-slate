#!/bin/bash
bundle exec middleman build --clean
mv build/index.html build/index.bak
sudo cp build/* /usr/share/nginx/html/ -r
