/*    */ package com.alipay.sdk.util;
/*    */ 
/*    */ import com.alipay.sdk.cons.GlobalConstants;
/*    */ import com.alipay.sdk.encrypt.Rsa;
/*    */ import com.alipay.sdk.encrypt.TriDes;
/*    */ import java.util.Iterator;
/*    */ import java.util.Locale;
/*    */ import org.json.JSONException;
/*    */ import org.json.JSONObject;
/*    */ 
/*    */ public class JsonUtils
/*    */ {
/*    */   public static JSONObject a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
/*    */   {
/* 30 */     JSONObject localJSONObject1 = new JSONObject();
/*    */     try
/*    */     {
/* 34 */       paramJSONObject1 = null; paramJSONObject2 = (paramJSONObject1 = new JSONObject[] { paramJSONObject1, paramJSONObject2 }).length;
/* 34 */       for (JSONObject localJSONObject2 = 0; localJSONObject2 < paramJSONObject2; localJSONObject2++)
/*    */       {
/*    */         Object localObject;
/* 35 */         if ((
/* 35 */           localObject = paramJSONObject1[localJSONObject2]) != null)
/*    */         {
/* 36 */           Iterator localIterator = localObject.keys();
/*    */ 
/* 40 */           while (localIterator.hasNext()) {
/* 41 */             String str = (String)localIterator.next();
/* 42 */             localJSONObject1.put(str, localObject.get(str));
/*    */           }
/*    */         }
/*    */       } } catch (JSONException localJSONException) {  }
/*    */ 
/* 46 */     return localJSONObject1;
/*    */   }
/*    */ 
/*    */   public static String a(String paramString1, String paramString2)
/*    */   {
/* 53 */     String str = GlobalConstants.d;
/*    */ 
/* 55 */     str = Rsa.a(paramString1, str);
/* 56 */     paramString1 = TriDes.a(paramString1, paramString2);
/* 57 */     return String.format(Locale.getDefault(), "%08X%s%08X%s", new Object[] { Integer.valueOf(str.length()), str, Integer.valueOf(paramString1.length()), paramString1 });
/*    */   }
/*    */ }

/* Location:           /Users/xujh/Downloads/WS_MOBILE_PAY_SDK_BASE/移动支付接口SDK2.0标准版(20150121)/DEMO/客户端demo/支付宝移动支付SDK标准版(Android 2.2)/alipay-sdk-common/alipaysdk.jar
 * Qualified Name:     com.alipay.sdk.util.JsonUtils
 * JD-Core Version:    0.6.2
 */