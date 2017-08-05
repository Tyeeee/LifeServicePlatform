package com.service.customer.net.entity;

import android.os.Parcel;

import com.alibaba.fastjson.JSONObject;
import com.service.customer.BuildConfig;
import com.service.customer.base.constant.net.ResponseParameterKey;
import com.service.customer.base.net.model.BaseEntity;


public class ConfigInfo extends BaseEntity {

    private String serverUrl;
    private int    version;
    private String downloadUrl;
    private int    lowestVersion;
    private String updateMessage;

    public ConfigInfo() {
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public int getVersion() {
        return version;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public int getLowestVersion() {
        return lowestVersion;
    }

    public String getUpdateMessage() {
        return updateMessage;
    }

    public ConfigInfo parse(JSONObject object) {
        if (object != null) {
            this.version = object.getIntValue(ResponseParameterKey.VERSION);
            this.lowestVersion = object.getIntValue(ResponseParameterKey.LOWEST_VERSION);
            this.updateMessage = object.getString(ResponseParameterKey.UPDATE_MESSAGE);
            this.downloadUrl = object.getString(ResponseParameterKey.DOWNLOAD_URL);
            //todo
//            this.key = object.getString(ResponseParameterKey.KEY);
            if (object.containsKey(ResponseParameterKey.INTERFACE_URL)) {
//                JSONObject interfaceUrl = object.getJSONObject(ResponseParameterKey.USER_INFO);
            }
            return this;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        if (BuildConfig.DEBUG) {
            return "ConfigInfo{" +
                    "version:" + version + '\'' +
                    ", serverUrl:" + serverUrl + '\'' +
                    ", lowestVersion:" + lowestVersion + '\'' +
                    ", updateMessage:" + updateMessage + '\'' +
                    ", downloadUrl:" + downloadUrl + '\'' +
                    '}';
        } else {
            return super.toString();
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.serverUrl);
        dest.writeInt(this.version);
        dest.writeString(this.downloadUrl);
        dest.writeInt(this.lowestVersion);
        dest.writeString(this.updateMessage);
    }

    protected ConfigInfo(Parcel in) {
        super(in);
        this.serverUrl = in.readString();
        this.version = in.readInt();
        this.downloadUrl = in.readString();
        this.lowestVersion = in.readInt();
        this.updateMessage = in.readString();
    }

    public static final Creator<ConfigInfo> CREATOR = new Creator<ConfigInfo>() {
        @Override
        public ConfigInfo createFromParcel(Parcel source) {
            return new ConfigInfo(source);
        }

        @Override
        public ConfigInfo[] newArray(int size) {
            return new ConfigInfo[size];
        }
    };
}
