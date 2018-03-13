package com.levadniy.alexander.headunitcore;

import com.levadniy.alexander.headunitcore.IMcuCallback;

interface IMcuBridge {
    oneway void send(String msg);

    oneway void setCallback(in IMcuCallback callback);
}
