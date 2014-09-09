package com.tencent.mm.cache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.f.ad;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class MCacheItem
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new e();
  private ad dJt;

  public MCacheItem(Parcel paramParcel)
  {
    this.dJt = a(paramParcel);
  }

  public MCacheItem(ad paramad)
  {
    this.dJt = paramad;
  }

  // ERROR //
  private ad a(Parcel paramParcel)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: invokevirtual 36	android/os/Parcel:readString	()Ljava/lang/String;
    //   6: invokestatic 42	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   9: astore 4
    //   11: aload_0
    //   12: aload 4
    //   14: invokevirtual 46	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   17: checkcast 48	com/tencent/mm/sdk/f/ad
    //   20: putfield 27	com/tencent/mm/cache/MCacheItem:dJt	Lcom/tencent/mm/sdk/f/ad;
    //   23: aload 4
    //   25: invokestatic 52	com/tencent/mm/sdk/f/ad:c	(Ljava/lang/Class;)[Ljava/lang/reflect/Field;
    //   28: astore 6
    //   30: aload 6
    //   32: arraylength
    //   33: istore 7
    //   35: iload_2
    //   36: iload 7
    //   38: if_icmpge +72 -> 110
    //   41: aload 6
    //   43: iload_2
    //   44: aaload
    //   45: astore 8
    //   47: getstatic 58	com/tencent/mm/cache/f:dJv	Ljava/util/Map;
    //   50: aload 8
    //   52: invokevirtual 64	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   55: invokeinterface 70 2 0
    //   60: checkcast 72	java/lang/reflect/Method
    //   63: astore 9
    //   65: aload 9
    //   67: ifnull +37 -> 104
    //   70: iconst_3
    //   71: anewarray 4	java/lang/Object
    //   74: astore 11
    //   76: aload 11
    //   78: iconst_0
    //   79: aload_1
    //   80: aastore
    //   81: aload 11
    //   83: iconst_1
    //   84: aload 8
    //   86: aastore
    //   87: aload 11
    //   89: iconst_2
    //   90: aload_0
    //   91: getfield 27	com/tencent/mm/cache/MCacheItem:dJt	Lcom/tencent/mm/sdk/f/ad;
    //   94: aastore
    //   95: aload 9
    //   97: aconst_null
    //   98: aload 11
    //   100: invokevirtual 76	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   103: pop
    //   104: iinc 2 1
    //   107: goto -72 -> 35
    //   110: aload_0
    //   111: getfield 27	com/tencent/mm/cache/MCacheItem:dJt	Lcom/tencent/mm/sdk/f/ad;
    //   114: astore 13
    //   116: aload 13
    //   118: areturn
    //   119: astore_3
    //   120: aconst_null
    //   121: areturn
    //   122: astore 10
    //   124: goto -20 -> 104
    //   127: astore 5
    //   129: goto -106 -> 23
    //
    // Exception table:
    //   from	to	target	type
    //   2	11	119	java/lang/Exception
    //   23	35	119	java/lang/Exception
    //   41	65	119	java/lang/Exception
    //   110	116	119	java/lang/Exception
    //   70	104	122	java/lang/Exception
    //   11	23	127	java/lang/Exception
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.dJt.getClass().getName());
    Field[] arrayOfField = ad.c(this.dJt.getClass());
    int i = arrayOfField.length;
    int j = 0;
    while (true)
    {
      Field localField;
      Method localMethod;
      if (j < i)
      {
        localField = arrayOfField[j];
        localMethod = (Method)f.dJu.get(localField.getType());
        if (localMethod == null);
      }
      try
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = paramParcel;
        arrayOfObject[1] = localField;
        arrayOfObject[2] = this.dJt;
        localMethod.invoke(null, arrayOfObject);
        label102: j++;
        continue;
        return;
      }
      catch (Exception localException)
      {
        break label102;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.MCacheItem
 * JD-Core Version:    0.6.2
 */