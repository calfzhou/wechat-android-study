package com.tencent.mm.ar;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ImageSpan;
import com.tencent.mm.c.a.eh;
import com.tencent.mm.c.a.ei;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static a iGO = null;
  private static boolean iGP = false;
  private static HashMap iGQ = new HashMap();
  private static g iHb = new c();
  private String[] iGR;
  private String[] iGS;
  private String[] iGT;
  private String[] iGU;
  private HashMap iGV = new HashMap();
  private int[] iGW;
  private HashMap iGX = new HashMap();
  private HashMap iGY = new HashMap();
  private HashMap iGZ = new HashMap();
  private HashMap iHa = new HashMap();

  private a(Context paramContext)
  {
    eh localeh = new eh();
    com.tencent.mm.sdk.c.a.aGB().g(localeh);
    if (localeh.cJX.cIb == 1);
    for (boolean bool = true; ; bool = false)
    {
      iGP = bool;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(iGP);
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "init, isUseUnicode:%b", arrayOfObject);
      this.iGR = paramContext.getResources().getStringArray(com.tencent.mm.c.Nb);
      this.iGS = paramContext.getResources().getStringArray(com.tencent.mm.c.Nd);
      this.iGU = paramContext.getResources().getStringArray(com.tencent.mm.c.Ne);
      this.iGT = paramContext.getResources().getStringArray(com.tencent.mm.c.Nf);
      String[] arrayOfString = paramContext.getResources().getStringArray(com.tencent.mm.c.Nc);
      this.iGW = new int[arrayOfString.length];
      while (i < arrayOfString.length)
      {
        this.iGW[i] = Integer.parseInt(arrayOfString[i]);
        this.iGV.put(Integer.valueOf(this.iGW[i]), Integer.valueOf(i));
        i++;
      }
    }
  }

  public static Drawable A(Context paramContext, int paramInt)
  {
    if (paramContext == null);
    int i;
    do
    {
      return null;
      i = paramContext.getResources().getIdentifier("emoji_" + paramInt, "drawable", paramContext.getPackageName());
    }
    while (i == 0);
    return paramContext.getResources().getDrawable(i);
  }

  private static String B(Context paramContext, int paramInt)
  {
    HashMap localHashMap = cb(paramContext).iGV;
    String str = y.d(paramContext.getSharedPreferences(ak.aHi(), 0));
    String[] arrayOfString;
    if (str.equals("zh_CN"))
      arrayOfString = cb(paramContext).iGS;
    while (localHashMap.containsKey(Integer.valueOf(paramInt)))
    {
      int i = ((Integer)localHashMap.get(Integer.valueOf(paramInt))).intValue();
      if (i >= arrayOfString.length)
        break;
      return arrayOfString[i];
      if ((str.equals("zh_TW")) || (str.equals("zh_HK")))
      {
        arrayOfString = cb(paramContext).iGT;
      }
      else
      {
        str.equals("en");
        arrayOfString = cb(paramContext).iGU;
      }
    }
    return null;
  }

  @Deprecated
  public static String Bb(String paramString)
  {
    return paramString;
  }

  private static String Bc(String paramString)
  {
    int i = 0;
    if (ch.jb(paramString))
      return "";
    a locala = cb(ak.getContext());
    locala.aNS();
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar1 = paramString.toCharArray();
    for (int j = 0; j < arrayOfChar1.length; j++)
    {
      String str1 = Integer.toHexString(arrayOfChar1[j]);
      String str2 = (String)locala.iGY.get(str1);
      if (!ch.jb(str2))
      {
        String[] arrayOfString = str2.split(" ");
        for (int m = 0; m < arrayOfString.length; m++)
        {
          char[] arrayOfChar3 = Character.toChars(Integer.decode("0x" + arrayOfString[m]).intValue());
          for (int n = 0; n < arrayOfChar3.length; n++)
            localArrayList.add(Character.valueOf(arrayOfChar3[n]));
        }
      }
      localArrayList.add(Character.valueOf(arrayOfChar1[j]));
    }
    char[] arrayOfChar2 = new char[localArrayList.size()];
    while (i < localArrayList.size())
    {
      arrayOfChar2[i] = ((Character)localArrayList.get(i)).charValue();
      i++;
    }
    int k = localArrayList.size() - arrayOfChar1.length;
    iGQ.put(paramString, Integer.valueOf(k));
    return new String(arrayOfChar2);
  }

  private static int Bd(String paramString)
  {
    if (ch.jb(paramString))
      return 0;
    a locala = cb(ak.getContext());
    locala.aNS();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    int j = 0;
    if (i < arrayOfChar.length)
    {
      String str1 = Integer.toHexString(arrayOfChar[i]);
      String str2 = (String)locala.iGY.get(str1);
      if (!ch.jb(str2))
        j += str2.split(" ").length;
      while (true)
      {
        i++;
        break;
        j++;
      }
    }
    return j - arrayOfChar.length;
  }

  public static int Be(String paramString)
  {
    if (iGP)
    {
      if (!iGQ.containsKey(paramString))
      {
        int i = Bd(paramString);
        iGQ.put(paramString, Integer.valueOf(i));
      }
    }
    else
      return 0;
    Bd(paramString);
    return 0;
  }

  private static String Bf(String paramString)
  {
    int i = 0;
    if (ch.jb(paramString))
      return paramString;
    a locala = cb(ak.getContext());
    locala.aNS();
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      int j;
      try
      {
        char[] arrayOfChar1 = paramString.toCharArray();
        if ((arrayOfChar1 == null) || (arrayOfChar1.length == 0))
          break;
        j = 0;
        if (j < arrayOfChar1.length)
        {
          char c = arrayOfChar1[j];
          String str2 = Integer.toHexString(c);
          if (!ch.jb(str2))
            break label389;
          localArrayList.add(Character.valueOf(c));
          n = j + 1;
          if (locala.iGZ.containsKey(str2))
          {
            if (!str2.equals("d83c"))
            {
              int i2 = ((Integer)locala.iGZ.get(str2)).intValue();
              String str4 = b(n, i2, arrayOfChar1);
              if (!ch.jb(str4))
              {
                d(str4, localArrayList);
                j = i2 + n;
                continue;
              }
              localArrayList.add(Character.valueOf(c));
              j = n + 1;
              continue;
            }
            String str3 = b(n, 2, arrayOfChar1);
            if (!ch.jb(str3))
              break label383;
            str3 = b(n, 4, arrayOfChar1);
            i1 = 4;
            if (!ch.jb(str3))
            {
              d(str3, localArrayList);
              j = n + i1;
              continue;
            }
            localArrayList.add(Character.valueOf(c));
            j = n + 1;
            continue;
          }
          localArrayList.add(Character.valueOf(c));
          j = n + 1;
          continue;
        }
        if (localArrayList.size() < arrayOfChar1.length)
        {
          int k = arrayOfChar1.length - localArrayList.size();
          int m = 0;
          if (m < k)
          {
            localArrayList.add(Character.valueOf('\000'));
            m++;
            continue;
          }
        }
        char[] arrayOfChar2 = new char[localArrayList.size()];
        if (i < localArrayList.size())
        {
          arrayOfChar2[i] = ((Character)localArrayList.get(i)).charValue();
          i++;
          continue;
        }
        String str1 = new String(arrayOfChar2);
        return str1;
      }
      catch (Exception localException)
      {
        return paramString;
      }
      label383: int i1 = 2;
      continue;
      label389: int n = j;
    }
  }

  public static String Bg(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(iGP);
    z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "processBeforeSpan, isUseUnicode:%b", arrayOfObject);
    if (iGP)
      return Bc(paramString);
    return Bj(Bf(paramString));
  }

  private static boolean Bh(String paramString)
  {
    if (ch.jb(paramString));
    while (true)
    {
      return false;
      a locala = cb(ak.getContext());
      locala.aNS();
      char[] arrayOfChar = paramString.trim().toCharArray();
      int i = 0;
      while (i < arrayOfChar.length)
      {
        String str1 = Integer.toHexString(arrayOfChar[i]);
        if (ch.jb(str1))
        {
          i++;
        }
        else
        {
          if (locala.iGZ.containsKey(str1))
            if (!str1.equals("d83c"))
            {
              if (!ch.jb(b(i, ((Integer)locala.iGZ.get(str1)).intValue(), arrayOfChar)))
                return true;
            }
            else
            {
              String str2 = b(i, 2, arrayOfChar);
              if (ch.jb(str2))
                str2 = b(i, 4, arrayOfChar);
              if (!ch.jb(str2))
                return true;
            }
          i++;
        }
      }
    }
  }

  private static boolean Bi(String paramString)
  {
    if (ch.jb(paramString));
    while (true)
    {
      return false;
      a locala = cb(ak.getContext());
      locala.aNS();
      char[] arrayOfChar = paramString.trim().toCharArray();
      for (int i = 0; i < arrayOfChar.length; i++)
      {
        String str = Integer.toHexString(arrayOfChar[i]);
        if (!ch.jb((String)locala.iGY.get(str)))
          return true;
      }
    }
  }

  public static String Bj(String paramString)
  {
    if (ch.jb(paramString))
      return paramString;
    while (true)
    {
      int i;
      try
      {
        char[] arrayOfChar = paramString.toCharArray();
        i = 0;
        if (i + 1 < arrayOfChar.length)
        {
          int j = arrayOfChar[i];
          if ((j == 55356) || (j == 55357))
          {
            arrayOfChar[i] = '.';
            arrayOfChar[(i + 1)] = '.';
            i++;
          }
        }
        else
        {
          String str = new String(arrayOfChar);
          return str;
        }
      }
      catch (Exception localException)
      {
        return paramString;
      }
      i++;
    }
  }

  public static Spannable a(Context paramContext, Spannable paramSpannable, int paramInt)
  {
    a(paramContext, paramSpannable, paramInt, 0);
    return paramSpannable;
  }

  private static String a(int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
      if (i < paramArrayOfChar.length)
      {
        localStringBuilder.append(Integer.toHexString(paramArrayOfChar[i]));
        localStringBuilder.append(" ");
      }
    return localStringBuilder.toString().trim();
  }

  public static boolean a(Context paramContext, Spannable paramSpannable, int paramInt1, int paramInt2)
  {
    boolean bool2;
    boolean bool1;
    if (Bi(paramSpannable.toString()))
      if ((paramSpannable == null) || (paramSpannable.length() == 0))
      {
        bool2 = false;
        bool1 = false;
      }
    while (true)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(bool2);
      arrayOfObject[1] = Boolean.valueOf(bool1);
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "checkSpan, hasSoftbank:%b, hasUnicodeSpan:%b", arrayOfObject);
      boolean bool3;
      if (!bool2)
      {
        bool3 = false;
        if (!bool1);
      }
      else
      {
        bool3 = true;
      }
      return bool3;
      char[] arrayOfChar = paramSpannable.toString().toCharArray();
      int i = 0;
      bool2 = false;
      label97: Drawable localDrawable;
      if (i < arrayOfChar.length)
      {
        int j = p(arrayOfChar[i]);
        if (j != -1)
        {
          localDrawable = A(paramContext, j);
          if (localDrawable != null)
          {
            localDrawable.setBounds(0, 0, (int)(1.3D * paramInt1), (int)(1.3D * paramInt1));
            if (paramInt2 != 0)
              break label192;
            paramSpannable.setSpan(new ImageSpan(localDrawable, 0), i, i + 1, 33);
          }
        }
      }
      while (true)
      {
        bool2 = true;
        i++;
        break label97;
        break;
        label192: com.tencent.mm.ui.widget.a locala = new com.tencent.mm.ui.widget.a(localDrawable, 0);
        locala.rB(paramInt2);
        paramSpannable.setSpan(locala, i, i + 1, 33);
      }
      if (Bh(paramSpannable.toString()))
      {
        bool1 = b(paramContext, paramSpannable, paramInt1, paramInt2);
        bool2 = false;
      }
      else
      {
        bool1 = false;
        bool2 = false;
      }
    }
  }

  private void aNS()
  {
    if (this.iGX.size() > 0)
      return;
    long l1 = System.currentTimeMillis();
    z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "start initV5EmojiMap");
    try
    {
      localInputStream = ak.getContext().getAssets().open("sbEmojiCodeTable");
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream));
      while (true)
      {
        String str1 = localBufferedReader.readLine();
        if (str1 == null)
          break;
        JSONObject localJSONObject = new JSONObject(str1);
        String str2 = localJSONObject.getString("utf16");
        String str3 = localJSONObject.getString("sbcode");
        this.iGX.put(str2, str3);
        this.iGY.put(str3.substring(3), str2);
        String[] arrayOfString = str2.split(" ");
        String str4 = arrayOfString[0];
        this.iGZ.put(str4, Integer.valueOf(arrayOfString.length));
      }
    }
    catch (IOException localIOException)
    {
      InputStream localInputStream;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localIOException.toString();
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "initV5EmojiMap error: %s", arrayOfObject2);
      return;
      localInputStream.close();
      long l2 = System.currentTimeMillis();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(l2 - l1);
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "finish initV5EmojiMap, used %d ms", arrayOfObject3);
      return;
    }
    catch (JSONException localJSONException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localJSONException.toString();
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "initV5EmojiMap error: %s", arrayOfObject1);
    }
  }

  private void aNT()
  {
    if (this.iHa.size() > 0)
      return;
    try
    {
      InputStream localInputStream = ak.getContext().getAssets().open("emojiSBUtfMap");
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream));
      while (true)
      {
        String str1 = localBufferedReader.readLine();
        if (str1 == null)
          break;
        JSONObject localJSONObject = new JSONObject(str1);
        String str2 = localJSONObject.getString("utf16");
        int i = localJSONObject.getInt("emoji_pos");
        this.iHa.put(str2, Integer.valueOf(i));
      }
      localInputStream.close();
      return;
    }
    catch (JSONException localJSONException)
    {
    }
    catch (IOException localIOException)
    {
    }
  }

  public static void aNU()
  {
    com.tencent.mm.sdk.c.a.aGB().a("EmojiUnicodeConfUpdate", iHb);
    eh localeh = new eh();
    com.tencent.mm.sdk.c.a.aGB().g(localeh);
    if (localeh.cJX.cIb == 1);
    for (boolean bool = true; ; bool = false)
    {
      iGP = bool;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(iGP);
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "init, isUseUnicode:%b", arrayOfObject);
      return;
    }
  }

  public static void aNV()
  {
    com.tencent.mm.sdk.c.a.aGB().b("EmojiUnicodeConfUpdate", iHb);
  }

  public static String ar(Context paramContext, String paramString)
  {
    if (ch.jb(paramString))
      return paramString;
    a locala;
    StringBuilder localStringBuilder;
    int i;
    label61: char c;
    String str2;
    if (Bh(paramString))
    {
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "spanToString, containsUtfEmoji");
      locala = cb(ak.getContext());
      locala.aNS();
      locala.aNT();
      localStringBuilder = new StringBuilder("");
      char[] arrayOfChar = paramString.trim().toCharArray();
      i = 0;
      while (true)
        if (i < arrayOfChar.length)
        {
          c = arrayOfChar[i];
          String str1 = Integer.toHexString(c);
          if (ch.jb(str1))
          {
            i++;
          }
          else if (locala.iGZ.containsKey(str1))
          {
            if (!str1.equals("d83c"))
            {
              int m = ((Integer)locala.iGZ.get(str1)).intValue();
              String str4 = a(i, m, arrayOfChar);
              if ((!ch.jb(str4)) && (locala.iHa.containsKey(str4)))
              {
                String str5 = B(paramContext, ((Integer)locala.iHa.get(str4)).intValue());
                if (!ch.jb(str5))
                  localStringBuilder.append(str5);
              }
              while (true)
              {
                i += m;
                break;
                localStringBuilder.append(".");
                continue;
                localStringBuilder.append(".");
              }
            }
            str2 = a(i, 2, arrayOfChar);
            if (locala.iHa.containsKey(str2))
              break label405;
            str2 = a(i, 4, arrayOfChar);
          }
        }
    }
    label405: for (int k = 4; ; k = 2)
    {
      if ((!ch.jb(str2)) && (locala.iHa.containsKey(str2)))
      {
        String str3 = B(paramContext, ((Integer)locala.iHa.get(str2)).intValue());
        if (!ch.jb(str3))
          localStringBuilder.append(str3);
      }
      while (true)
      {
        i += k;
        break;
        localStringBuilder.append(".");
        continue;
        localStringBuilder.append(".");
      }
      int j = i + 1;
      localStringBuilder.append(c);
      i = j;
      break label61;
      return localStringBuilder.toString();
      if (!Bi(paramString))
        break;
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "spanToString, containsSoftbankEmoji");
      return as(paramContext, paramString);
    }
  }

  private static String as(Context paramContext, String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    if (i < arrayOfChar.length)
    {
      int j = p(arrayOfChar[i]);
      if (j != -1)
      {
        String str = B(paramContext, j);
        if (!ch.jb(str))
          localStringBuffer.append(str);
      }
      while (true)
      {
        i++;
        break;
        localStringBuffer.append(".");
        continue;
        localStringBuffer.append(arrayOfChar[i]);
      }
    }
    return localStringBuffer.toString();
  }

  private static String b(int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    String str1 = a(paramInt1, paramInt2, paramArrayOfChar);
    if (ch.jb(str1))
      return null;
    a locala = cb(ak.getContext());
    locala.aNS();
    String str2 = (String)locala.iGX.get(str1);
    if (ch.jb(str2))
      return null;
    return str2.trim();
  }

  public static boolean b(Context paramContext, Spannable paramSpannable, int paramInt)
  {
    return a(paramContext, paramSpannable, paramInt, 0);
  }

  private static boolean b(Context paramContext, Spannable paramSpannable, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramSpannable == null) || (paramSpannable.length() == 0))
      bool = false;
    while (true)
    {
      return bool;
      a locala = cb(paramContext);
      locala.aNS();
      locala.aNT();
      char[] arrayOfChar = paramSpannable.toString().toCharArray();
      bool = false;
      int i = 0;
      while (i < arrayOfChar.length)
      {
        String str1 = Integer.toHexString(arrayOfChar[i]);
        if (ch.jb(str1))
        {
          i++;
        }
        else
        {
          if (locala.iGZ.containsKey(str1))
            if (!str1.equals("d83c"))
            {
              int m = ((Integer)locala.iGZ.get(str1)).intValue();
              String str3 = a(i, m, arrayOfChar);
              if ((!ch.jb(str3)) && (locala.iHa.containsKey(str3)))
              {
                Drawable localDrawable2 = A(paramContext, ((Integer)locala.iHa.get(str3)).intValue());
                if (localDrawable2 != null)
                {
                  localDrawable2.setBounds(0, 0, (int)(1.3D * paramInt1), (int)(1.3D * paramInt1));
                  if (paramInt2 == 0)
                    paramSpannable.setSpan(new ImageSpan(localDrawable2, 0), i, i + m, 33);
                  while (true)
                  {
                    int n = i + m;
                    bool = true;
                    i = n;
                    break;
                    com.tencent.mm.ui.widget.a locala2 = new com.tencent.mm.ui.widget.a(localDrawable2, 0);
                    locala2.rB(paramInt2);
                    paramSpannable.setSpan(locala2, i, i + m, 33);
                  }
                }
              }
            }
            else
            {
              int j = 2;
              String str2 = a(i, 2, arrayOfChar);
              if (!locala.iHa.containsKey(str2))
              {
                j = 4;
                str2 = a(i, 4, arrayOfChar);
              }
              if (locala.iHa.containsKey(str2))
              {
                Drawable localDrawable1 = A(paramContext, ((Integer)locala.iHa.get(str2)).intValue());
                if (localDrawable1 != null)
                {
                  localDrawable1.setBounds(0, 0, (int)(1.3D * paramInt1), (int)(1.3D * paramInt1));
                  if (paramInt2 == 0)
                    paramSpannable.setSpan(new ImageSpan(localDrawable1, 0), i, i + j, 33);
                  while (true)
                  {
                    int k = i + j;
                    bool = true;
                    i = k;
                    break;
                    com.tencent.mm.ui.widget.a locala1 = new com.tencent.mm.ui.widget.a(localDrawable1, 0);
                    locala1.rB(paramInt2);
                    paramSpannable.setSpan(locala1, i, i + j, 33);
                  }
                }
              }
            }
          i++;
        }
      }
    }
  }

  private static a cb(Context paramContext)
  {
    if (iGO == null)
      iGO = new a(paramContext);
    return iGO;
  }

  private static void d(String paramString, ArrayList paramArrayList)
  {
    char[] arrayOfChar = Character.toChars(Integer.decode(paramString).intValue());
    for (int i = 0; i < arrayOfChar.length; i++)
      paramArrayList.add(Character.valueOf(arrayOfChar[i]));
  }

  private static int p(char paramChar)
  {
    if ((paramChar < 57345) || (paramChar > 58679));
    do
    {
      return -1;
      if ((paramChar >= 57345) && (paramChar <= 57434))
        return paramChar - 57345;
      if ((paramChar >= 57601) && (paramChar <= 57690))
        return paramChar + 'Z' - 57601;
      if ((paramChar >= 57857) && (paramChar <= 57939))
        return paramChar + '´' - 57857;
      if ((paramChar >= 58113) && (paramChar <= 58189))
        return paramChar + 'ć' - 58113;
      if ((paramChar >= 58369) && (paramChar <= 58444))
        return paramChar + 'Ŕ' - 58369;
    }
    while ((paramChar < 58625) || (paramChar > 58679));
    return paramChar + 'Ơ' - 58625;
  }

  public static void release()
  {
    iGQ.clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.a
 * JD-Core Version:    0.6.2
 */