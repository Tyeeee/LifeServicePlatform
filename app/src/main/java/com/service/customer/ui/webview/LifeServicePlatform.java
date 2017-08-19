package com.service.customer.ui.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebView;

import com.alibaba.fastjson.JSONObject;
import com.service.customer.components.permission.listener.PermissionCallback;
import com.service.customer.components.utils.LogUtil;
import com.service.customer.constant.Constant;
import com.service.customer.constant.Temp;
import com.service.customer.net.entity.EvaluateInfo;
import com.service.customer.net.entity.TaskInfos;
import com.service.customer.ui.activity.EvaluateActivity;
import com.service.customer.ui.activity.TaskActivity;
import com.service.customer.ui.activity.WapActivity;
import com.service.customer.ui.contract.implement.ActivityViewImplement;

import java.util.List;

public class LifeServicePlatform {

    public static void call(final WebView webView, String data) {
        final ActivityViewImplement activityViewImplement = (ActivityViewImplement) webView.getContext();
        JSONObject jsonObject = JSONObject.parseObject(data);
        String tag = jsonObject.getString(Constant.JavaScript.TAG);
        String parameter = jsonObject.getString(Constant.JavaScript.PARAMETER);
        LogUtil.getInstance().print("object:" + jsonObject.toString());
        LogUtil.getInstance().print("tag:" + tag);
        LogUtil.getInstance().print("parameter:" + parameter);
        if (!TextUtils.isEmpty(tag)) {
            Bundle bundle;
            switch (tag) {
                //Volunteer.html
                case Constant.JavaScript.POLICIES_REGULATIONS:
                    if (!TextUtils.isEmpty(parameter)) {
                        String url = JSONObject.parseObject(parameter).getString(Constant.JavaScript.URL);
                        if (!TextUtils.isEmpty(url)) {
                            Intent intent = new Intent(activityViewImplement, WapActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.URL.getContent(), url);
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(WapActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.QUERY_ANALYSIS:
                    activityViewImplement.startActivity(WapActivity.class);
                    break;
                case Constant.JavaScript.INFORMATION_MANAGEMENT:
                    activityViewImplement.startActivity(WapActivity.class);
                    break;
                case Constant.JavaScript.EVENT_QUERY:
                    activityViewImplement.startActivity(WapActivity.class);
                    break;
                case Constant.JavaScript.MAP_QUERY:
                    activityViewImplement.startActivity(WapActivity.class);
                    break;
                //Demander.html
                case Constant.JavaScript.EMERGENCY_CALL_FOR_HELP:
                    if (!TextUtils.isEmpty(parameter)) {
                        String title = JSONObject.parseObject(parameter).getString(Constant.JavaScript.TITLE);
                        if (!TextUtils.isEmpty(title)) {
                            Intent intent = new Intent(activityViewImplement, TaskActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.TITLE.getContent(), title);
                            bundle.putBoolean(Temp.NEED_LOCATION.getContent(), JSONObject.parseObject(parameter).getBooleanValue(Constant.JavaScript.LOCATION));
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(TaskActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.APPLIANCE_MAINTENANCE:
                    if (!TextUtils.isEmpty(parameter)) {
                        String title = JSONObject.parseObject(parameter).getString(Constant.JavaScript.TITLE);
                        if (!TextUtils.isEmpty(title)) {
                            Intent intent = new Intent(activityViewImplement, TaskActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.TITLE.getContent(), title);
                            bundle.putBoolean(Temp.NEED_LOCATION.getContent(), JSONObject.parseObject(parameter).getBooleanValue(Constant.JavaScript.LOCATION));
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(TaskActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.LIVING_FACILITIES_MAINTENANCE:
                    if (!TextUtils.isEmpty(parameter)) {
                        String title = JSONObject.parseObject(parameter).getString(Constant.JavaScript.TITLE);
                        if (!TextUtils.isEmpty(title)) {
                            Intent intent = new Intent(activityViewImplement, TaskActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.TITLE.getContent(), title);
                            bundle.putBoolean(Temp.NEED_LOCATION.getContent(), JSONObject.parseObject(parameter).getBooleanValue(Constant.JavaScript.LOCATION));
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(TaskActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.OTHER_LIFE_EVENTS:
                    if (!TextUtils.isEmpty(parameter)) {
                        String title = JSONObject.parseObject(parameter).getString(Constant.JavaScript.TITLE);
                        if (!TextUtils.isEmpty(title)) {
                            Intent intent = new Intent(activityViewImplement, TaskActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.TITLE.getContent(), title);
                            bundle.putBoolean(Temp.NEED_LOCATION.getContent(), JSONObject.parseObject(parameter).getBooleanValue(Constant.JavaScript.LOCATION));
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(TaskActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.PSYCHOLOGICAL_COUNSELING:
                    if (!TextUtils.isEmpty(parameter)) {
                        String title = JSONObject.parseObject(parameter).getString(Constant.JavaScript.TITLE);
                        if (!TextUtils.isEmpty(title)) {
                            Intent intent = new Intent(activityViewImplement, TaskActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.TITLE.getContent(), title);
                            bundle.putBoolean(Temp.NEED_LOCATION.getContent(), JSONObject.parseObject(parameter).getBooleanValue(Constant.JavaScript.LOCATION));
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(TaskActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.DOCTOR_MEDICINE:
                    if (!TextUtils.isEmpty(parameter)) {
                        String title = JSONObject.parseObject(parameter).getString(Constant.JavaScript.TITLE);
                        if (!TextUtils.isEmpty(title)) {
                            Intent intent = new Intent(activityViewImplement, TaskActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.TITLE.getContent(), title);
                            bundle.putBoolean(Temp.NEED_LOCATION.getContent(), JSONObject.parseObject(parameter).getBooleanValue(Constant.JavaScript.LOCATION));
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(TaskActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.OTHER:
                    if (!TextUtils.isEmpty(parameter)) {
                        String title = JSONObject.parseObject(parameter).getString(Constant.JavaScript.TITLE);
                        if (!TextUtils.isEmpty(title)) {
                            Intent intent = new Intent(activityViewImplement, TaskActivity.class);
                            bundle = new Bundle();
                            bundle.putString(Temp.TITLE.getContent(), title);
                            bundle.putBoolean(Temp.NEED_LOCATION.getContent(), JSONObject.parseObject(parameter).getBooleanValue(Constant.JavaScript.LOCATION));
                            intent.putExtras(bundle);
                            activityViewImplement.startActivity(intent, bundle);
                        } else {
                            activityViewImplement.startActivity(TaskActivity.class);
                        }
                    }
                    break;
                case Constant.JavaScript.IMMEDIATE_EVALUATION:
                    if (!TextUtils.isEmpty(parameter)) {
                        Intent intent = new Intent(activityViewImplement, EvaluateActivity.class);
                        intent.putExtra(Temp.EVALUATE_INFO.getContent(), new EvaluateInfo().parse(JSONObject.parseObject(parameter)));
                        //bundle = new Bundle();
                        //bundle.putParcelable(Temp.EVALUATE_INFO.getContent(), new EvaluateInfo().parse(JSONObject.parseObject(parameter)));
                        //bundle.setClassLoader(EvaluateInfo.class.getClassLoader());
                        intent.setExtrasClassLoader(EvaluateInfo.class.getClassLoader());
                        //intent.putExtras(bundle);
                        activityViewImplement.startActivity(intent);
                    }
                    break;
                //電話
                case Constant.JavaScript.SECURETY_POLICE_CALL:
                case Constant.JavaScript.HOSPITAL_CALL:
                case Constant.JavaScript.TRAFFIC_POLICE_CALL:
                case Constant.JavaScript.FIRE_CONTROL_CALL:
                    if (!TextUtils.isEmpty(parameter)) {
                        final String phone = JSONObject.parseObject(parameter).getString(Constant.JavaScript.PHONE);
                        if (!TextUtils.isEmpty(phone)) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                activityViewImplement.getBasePresenterImplement().checkPermission(activityViewImplement, new PermissionCallback() {
                                    @Override
                                    public void onSuccess(int requestCode, @NonNull List<String> grantPermissions) {
                                        activityViewImplement.startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone)));
                                    }

                                    @Override
                                    public void onFailed(int requestCode, @NonNull List<String> deniedPermissions) {
                                        activityViewImplement.showPermissionPromptDialog();
                                    }
                                });
                            } else {
                                activityViewImplement.startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone)));
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
