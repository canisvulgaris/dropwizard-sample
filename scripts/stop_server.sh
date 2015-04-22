#!/bin/bash

#stop services
isRunning=`pgrep java`
if [[ -n  $isRunning ]]; then
    pkill java
fi
