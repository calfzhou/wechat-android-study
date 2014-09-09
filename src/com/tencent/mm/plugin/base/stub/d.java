package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public final class d extends c
{
  private static final Map ehD;

  static
  {
    HashMap localHashMap = new HashMap();
    ehD = localHashMap;
    localHashMap.put("_build_info_sdk_int_", Integer.valueOf(570490883));
    ehD.put("_build_info_sdk_name_", "android 2.1.3");
    ehD.put("_wxapp_pay_entry_classname_", "com.tencent.mm.plugin.base.stub.WXPayEntryActivity");
  }

  public static Uri HG()
  {
    return null;
  }

  public static int HH()
  {
    return 0;
  }

  public static int HI()
  {
    return 0;
  }

  public static Cursor a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    String str1 = paramArrayOfString2[0];
    Object localObject = ehD.get(str1);
    if (localObject == null)
    {
      z.w("!56@/B4Tb64lLpJVwK899MjSHnGus/LYixbx/xUPPDfdLnaW++vs6UTDlA==", "not found value for key: " + str1);
      return null;
    }
    int i;
    MatrixCursor localMatrixCursor;
    Object[] arrayOfObject;
    if (localObject == null)
    {
      z.e("!56@/B4Tb64lLpJ4ba4B7uT0vIuwclbFoi5gAykVHqdxOX6pBh8qPlAfTg==", "unresolve failed, null value");
      i = 0;
      localMatrixCursor = new MatrixCursor(paramArrayOfString1);
      arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(0);
      arrayOfObject[1] = str1;
      arrayOfObject[2] = Integer.valueOf(i);
      if (localObject != null)
        break label228;
    }
    label228: for (String str2 = null; ; str2 = localObject.toString())
    {
      arrayOfObject[3] = str2;
      localMatrixCursor.addRow(arrayOfObject);
      return localMatrixCursor;
      if ((localObject instanceof Integer))
      {
        i = 1;
        break;
      }
      if ((localObject instanceof Long))
      {
        i = 2;
        break;
      }
      if ((localObject instanceof String))
      {
        i = 3;
        break;
      }
      if ((localObject instanceof Boolean))
      {
        i = 4;
        break;
      }
      if ((localObject instanceof Float))
      {
        i = 5;
        break;
      }
      if ((localObject instanceof Double))
      {
        i = 6;
        break;
      }
      z.e("!56@/B4Tb64lLpJ4ba4B7uT0vIuwclbFoi5gAykVHqdxOX6pBh8qPlAfTg==", "unresolve failed, unknown type=" + localObject.getClass().toString());
      i = 0;
      break;
    }
  }

  public final boolean aj(Context paramContext)
  {
    super.aj(paramContext);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.d
 * JD-Core Version:    0.6.2
 */