package com.tencent.mm.remoteservice;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.mm.sdk.platformtools.z;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class a extends d
{
  private final j eZB;
  protected RemoteService ibw;
  public c ibx;

  public a(j paramj)
  {
    this.eZB = paramj;
  }

  private static Bundle h(Object[] paramArrayOfObject)
  {
    Bundle localBundle = new Bundle();
    int i = paramArrayOfObject.length;
    int j = 0;
    if (j < i)
    {
      if ((paramArrayOfObject[j] instanceof Bundle))
        localBundle.putBundle(String.valueOf(j), (Bundle)paramArrayOfObject[j]);
      while (true)
      {
        j++;
        break;
        if ((paramArrayOfObject[j] instanceof Parcelable))
          localBundle.putParcelable(String.valueOf(j), (Parcelable)paramArrayOfObject[j]);
        else
          localBundle.putSerializable(String.valueOf(j), (Serializable)paramArrayOfObject[j]);
      }
    }
    return localBundle;
  }

  public Object CLIENT_CALL(String paramString, Object[] paramArrayOfObject)
  {
    Bundle localBundle = h(paramArrayOfObject);
    try
    {
      this.ibx.onCallback(paramString, localBundle, true);
      label17: return localBundle.get("result_key");
    }
    catch (Exception localException)
    {
      break label17;
    }
  }

  public Object REMOTE_CALL(String paramString, Object[] paramArrayOfObject)
  {
    if (this.eZB.isConnected())
    {
      Bundle localBundle = h(paramArrayOfObject);
      this.eZB.a(this, paramString, localBundle);
      return localBundle.get("result_key");
    }
    this.eZB.m(new b(this, paramArrayOfObject, paramString));
    return null;
  }

  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    int i = 0;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = getClass().getName();
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = Boolean.valueOf(paramBoolean);
    z.d("!44@/B4Tb64lLpKH0xQPqIE+t1LJp5X4HQlGk5nmgkD8N7c=", "class:%s, method:%s, clientCall:%B", arrayOfObject);
    while (true)
    {
      int k;
      Object localObject1;
      Object localObject2;
      try
      {
        Method[] arrayOfMethod = getClass().getMethods();
        int j = arrayOfMethod.length;
        k = 0;
        localObject1 = null;
        if (k < j)
        {
          Method localMethod = arrayOfMethod[k];
          if (!localMethod.getName().equalsIgnoreCase(paramString))
            break label223;
          localObject1 = localMethod;
          break label201;
          if (localObject1.isAnnotationPresent((Class)localObject2))
          {
            LinkedList localLinkedList = new LinkedList();
            int m = paramBundle.size();
            if (i < m)
            {
              String str = String.valueOf(i);
              if (!paramBundle.containsKey(str))
                break label217;
              localLinkedList.add(paramBundle.get(str));
              break label217;
            }
            Object localObject3 = localObject1.invoke(this, localLinkedList.toArray());
            if (localObject1.getReturnType() != Void.TYPE)
              paramBundle.putSerializable("result_key", (Serializable)localObject3);
          }
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      label201: if (localObject1 != null)
        if (paramBoolean)
        {
          localObject2 = l.class;
          continue;
          label217: i++;
          continue;
          label223: k++;
        }
        else
        {
          localObject2 = m.class;
        }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.a
 * JD-Core Version:    0.6.2
 */