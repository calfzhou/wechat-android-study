package com.tencent.mm.console;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.StatFs;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.u;
import com.tencent.mm.c.a.au;
import com.tencent.mm.c.a.ki;
import com.tencent.mm.compatible.c.aa;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bt;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.t;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.cm;
import com.tencent.mm.storage.r;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.account.RegByMobileWaitingSMSUI;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.smtt.sdk.WebView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import junit.framework.Assert;

final class b
{
  private static int dPn = 0;

  public static void a(File paramFile1, File paramFile2)
  {
    if (paramFile1.exists())
      paramFile1.delete();
    FileInputStream localFileInputStream;
    FileOutputStream localFileOutputStream;
    while (true)
    {
      try
      {
        localFileInputStream = new FileInputStream(paramFile2);
        localFileOutputStream = new FileOutputStream(paramFile1);
        byte[] arrayOfByte = new byte[1024];
        if (localFileInputStream.read(arrayOfByte) == -1)
          break;
        localFileOutputStream.write(arrayOfByte);
        continue;
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "copy file fail");
        return;
      }
      try
      {
        paramFile1.createNewFile();
      }
      catch (IOException localIOException)
      {
        z.e("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "copy file fail");
        return;
      }
    }
    localFileInputStream.close();
    localFileOutputStream.close();
  }

  private static StringBuilder cu(int paramInt)
  {
    Date localDate = new Date(com.tencent.mm.sdk.platformtools.ch.CM() - 86400000L * paramInt);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    String str1 = com.tencent.mm.compatible.g.h.dOR + "crash_" + localSimpleDateFormat.format(localDate) + ".txt";
    StringBuilder localStringBuilder = new StringBuilder();
    if (!new File(str1).exists())
      return new StringBuilder(" day -" + paramInt + " no crash.");
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str1)));
      if (com.tencent.mm.sdk.platformtools.ch.jb(localBufferedReader.readLine()))
      {
        localBufferedReader.close();
        return new StringBuilder("read day -" + paramInt + "file failed");
      }
      while (true)
      {
        String str2 = localBufferedReader.readLine();
        if (str2 == null)
          break;
        localStringBuilder.append(new String(android.util.Base64.decode(str2.split("error_")[1], 0)).split("#accinfo.uin=")[1]);
        localStringBuilder.append("\n_____________________________________\n");
      }
      localBufferedReader.close();
    }
    catch (Exception localException)
    {
    }
    return localStringBuilder;
  }

  private static void e(File paramFile)
  {
    if ((paramFile.exists()) && (paramFile.isDirectory()))
    {
      if (paramFile.listFiles().length != 0)
        break label28;
      paramFile.delete();
    }
    while (true)
    {
      return;
      label28: File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        if (arrayOfFile[j].isDirectory())
          e(arrayOfFile[j]);
        arrayOfFile[j].delete();
      }
    }
  }

  private static int fk(String paramString)
  {
    if ((!paramString.startsWith("//")) || (paramString.length() <= 2));
    while (true)
    {
      return 0;
      int i = paramString.indexOf(" ");
      if (i == -1)
        i = paramString.length();
      try
      {
        int j = Integer.parseInt(paramString.substring(2, i));
        int k = com.tencent.mm.protocal.a.hrn % 256;
        if ((j >= k) && (j % k == 0))
          return j / k;
      }
      catch (Exception localException)
      {
      }
    }
    return 0;
  }

  private static String iH(String paramString)
  {
    int i = paramString.indexOf(" ");
    if (i < 0)
      return "";
    return paramString.substring(i).trim();
  }

  public static boolean k(Context paramContext, String paramString)
  {
    int i = 0;
    if (paramString.equals("//version"))
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = com.tencent.mm.sdk.platformtools.l.a(paramContext, com.tencent.mm.protocal.a.hrn, true);
      arrayOfObject1[1] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
      localStringBuilder1.append(String.format("[ver ] %s %08X\n", arrayOfObject1));
      localStringBuilder1.append(com.tencent.mm.sdk.platformtools.k.aNb());
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(com.tencent.mm.sdk.platformtools.l.cFn);
      localStringBuilder1.append(String.format("[cid ] %d\n", arrayOfObject2));
      TextView localTextView1 = new TextView(paramContext);
      localTextView1.setText(localStringBuilder1);
      localTextView1.setGravity(19);
      localTextView1.setTextSize(1, 10.0F);
      localTextView1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localTextView1.setTextColor(-16711936);
      localTextView1.setTypeface(Typeface.MONOSPACE);
      int j = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.PA);
      localTextView1.setPadding(j, j, j, j);
      com.tencent.mm.ui.base.e.a(paramContext, null, localTextView1, null);
    }
    com.tencent.mm.pluginsdk.ac localac;
    do
    {
      String str20;
      do
      {
        do
        {
          String str22;
          do
          {
            while (true)
            {
              return true;
              if (paramString.startsWith("//assert"))
              {
                Assert.assertTrue("test errlog " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
                return true;
              }
              if (paramString.startsWith("//pushassert"))
              {
                WatchDogPushReceiver.As();
                return true;
              }
              if (paramString.startsWith("//commitxlog"))
              {
                WatchDogPushReceiver.At();
                z.appenderFlush();
                return true;
              }
              if (paramString.equalsIgnoreCase("//switchtabpos"))
              {
                SharedPreferences localSharedPreferences2 = LauncherUI.aPm().getSharedPreferences(ak.aHi(), 0);
                boolean bool2 = localSharedPreferences2.getBoolean("settings_nav_tab_pos", true);
                SharedPreferences.Editor localEditor = localSharedPreferences2.edit();
                boolean bool3 = false;
                if (!bool2)
                  bool3 = true;
                localEditor.putBoolean("settings_nav_tab_pos", bool3).commit();
                if (LauncherUI.aPm() != null)
                {
                  LauncherUI.aPm().aPr();
                  return true;
                }
              }
              else
              {
                if (paramString.startsWith("//printcrash"))
                {
                  String str36 = paramString.replace("//printcrash ", "");
                  TextView localTextView2 = new TextView(paramContext);
                  localTextView2.setText(cu(com.tencent.mm.sdk.platformtools.ch.getInt(str36, 0)));
                  localTextView2.setGravity(19);
                  localTextView2.setTextSize(1, 8.0F);
                  localTextView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                  localTextView2.setTextColor(-16711936);
                  localTextView2.setTypeface(Typeface.MONOSPACE);
                  int i7 = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.PQ);
                  localTextView2.setPadding(i7, i7, i7, i7);
                  localTextView2.setMovementMethod(ScrollingMovementMethod.getInstance());
                  com.tencent.mm.ui.base.e.a(paramContext, null, localTextView2, null);
                  return true;
                }
                if (paramString.startsWith("//whatsnew"))
                {
                  MMAppMgr.f((Activity)paramContext, 57005);
                  return true;
                }
                if (paramString.startsWith("//profile "))
                {
                  com.tencent.mm.storage.i locali2 = bg.qW().oT().ys(paramString.replace("//profile ", "").trim());
                  if ((locali2 != null) && ((int)locali2.dhv != 0))
                  {
                    Intent localIntent8 = new Intent().setClass(paramContext, ContactInfoUI.class);
                    localIntent8.putExtra("Contact_User", locali2.getUsername());
                    paramContext.startActivity(localIntent8);
                    return true;
                  }
                }
                else
                {
                  if (paramString.startsWith("//getfpkey"))
                  {
                    String str35 = cm.aKL();
                    com.tencent.mm.ui.base.e.a(paramContext, str35, "Fingerprint Key", paramContext.getString(n.coG), paramContext.getString(n.bAP), new c(paramContext, str35), null);
                    return true;
                  }
                  if (paramString.startsWith("//commitwd"))
                  {
                    WatchDogPushReceiver.Ar();
                    return true;
                  }
                  if (paramString.startsWith("//remittance reset"))
                  {
                    bg.qW().oQ().set(327729, "0");
                    return true;
                  }
                  if (paramString.startsWith("//wv "))
                  {
                    String str34 = paramString.replace("//wv ", "");
                    Intent localIntent7 = new Intent();
                    localIntent7.putExtra("rawUrl", str34);
                    com.tencent.mm.am.a.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent7);
                    return true;
                  }
                  if (paramString.startsWith("//wvlocal "))
                  {
                    String str33 = paramString.replace("//wvlocal ", "");
                    Intent localIntent6 = new Intent();
                    localIntent6.putExtra("rawUrl", str33);
                    com.tencent.mm.am.a.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent6);
                    return true;
                  }
                  if (paramString.startsWith("//wvkernel"))
                  {
                    com.tencent.mm.ui.widget.l.cL(paramContext);
                    boolean bool1 = v.dNE.dNP;
                    String str32 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 0).getString("webview_x5_kernel_section", null);
                    int i6 = WebView.getQQBrowserCoreVersion(paramContext);
                    Object[] arrayOfObject5 = new Object[3];
                    arrayOfObject5[0] = Boolean.valueOf(bool1);
                    arrayOfObject5[1] = Integer.valueOf(i6);
                    arrayOfObject5[2] = str32;
                    Toast.makeText(paramContext, String.format("forceUseSys:%b\ncurrentX5:%d\nx5VersionSection:%s", arrayOfObject5), 1).show();
                    return true;
                  }
                  if (paramString.startsWith("//x5kernel"))
                  {
                    String[] arrayOfString5 = paramString.split(" ");
                    if (arrayOfString5.length > 1)
                    {
                      String str31 = arrayOfString5[1];
                      SharedPreferences localSharedPreferences1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 0);
                      if (str31.equals("1"))
                      {
                        localSharedPreferences1.edit().putBoolean("forceUseX5Kernel", true).commit();
                        return true;
                      }
                      localSharedPreferences1.edit().putBoolean("forceUseX5Kernel", false).commit();
                      return true;
                    }
                  }
                  else
                  {
                    if (paramString.startsWith("//channelId"))
                      com.tencent.mm.ui.base.e.o(paramContext, com.tencent.mm.sdk.platformtools.l.cFn, "channelId");
                    if (paramString.startsWith("//traceroute"))
                    {
                      com.tencent.mm.am.a.l(paramContext, "traceroute", ".ui.NetworkDiagnoseIntroUI");
                      return true;
                    }
                    if (paramString.startsWith("//qzone "))
                    {
                      String str30 = paramString.replace("//qzone ", "");
                      new com.tencent.mm.ui.applet.y(paramContext).qw(str30);
                    }
                    if (paramString.startsWith("//dumpcrash"))
                    {
                      p.f(com.tencent.mm.compatible.g.h.dgF + "crash/", com.tencent.mm.compatible.g.h.dOR, false);
                      return true;
                    }
                    if (paramString.startsWith("//dumpanr"))
                    {
                      p.f("/data/anr/", com.tencent.mm.compatible.g.h.dOR, false);
                      return true;
                    }
                    if (paramString.startsWith("//getip"))
                    {
                      bg.qX().d(new ce(new d()));
                      return true;
                    }
                    if (paramString.startsWith("//getlocalkey"))
                    {
                      String str29 = cm.aKK();
                      com.tencent.mm.ui.base.e.a(paramContext, str29, "Fingerprint Key", paramContext.getString(n.coG), paramContext.getString(n.bAP), new e(paramContext, str29), null);
                      return true;
                    }
                    if (paramString.startsWith("//testhtml"))
                    {
                      Intent localIntent1 = new Intent();
                      localIntent1.putExtra("rawUrl", "file:///android_asset/jsapi/reader_test1.html");
                      com.tencent.mm.am.a.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent1);
                      return true;
                    }
                    if (paramString.startsWith("//testlocalhtml "))
                    {
                      String str28 = paramString.replace("//testlocalhtml ", "");
                      Intent localIntent5 = new Intent();
                      localIntent5.putExtra("rawUrl", "file://" + str28);
                      localIntent5.putExtra("neverGetA8Key", true);
                      com.tencent.mm.am.a.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent5);
                      return true;
                    }
                    if (paramString.startsWith("//setkey"))
                    {
                      if (cm.Aa(paramString.replace("//setkey", "")))
                      {
                        Toast.makeText(paramContext, n.coy, 0).show();
                        return true;
                      }
                    }
                    else if (paramString.startsWith("//checkspell"))
                    {
                      String str27 = paramString.replace("//checkspell ", "");
                      if (!com.tencent.mm.sdk.platformtools.ch.jb(str27))
                      {
                        StringBuilder localStringBuilder2 = new StringBuilder();
                        while (i < str27.length())
                        {
                          localStringBuilder2.append("[" + str27.charAt(i) + ":" + SpellMap.j(str27.charAt(i)) + "]");
                          i++;
                        }
                        com.tencent.mm.ui.base.e.o(paramContext, localStringBuilder2.toString(), "Check Spell");
                        return true;
                      }
                    }
                    else
                    {
                      if (paramString.startsWith("//cleargiffolder"))
                      {
                        File[] arrayOfFile1 = new File(bg.qW().pi()).listFiles();
                        if ((arrayOfFile1 != null) && (arrayOfFile1.length > 0))
                          for (int i4 = 0; i4 < arrayOfFile1.length; i4++)
                          {
                            File localFile3 = arrayOfFile1[i4];
                            if ((localFile3 != null) && (localFile3.isDirectory()))
                            {
                              File[] arrayOfFile2 = localFile3.listFiles();
                              if ((arrayOfFile2 != null) && (arrayOfFile2.length > 0))
                                for (int i5 = 0; i5 < arrayOfFile2.length; i5++)
                                  if (arrayOfFile2[i5].isDirectory())
                                    e(arrayOfFile2[i5]);
                            }
                          }
                      }
                      if (paramString.startsWith("//gallery "))
                      {
                        String str26 = paramString.replace("//gallery ", "");
                        if (!com.tencent.mm.sdk.platformtools.ch.jb(str26))
                        {
                          paramContext.getSharedPreferences(ak.aHi(), 0).edit().putString("gallery", str26).commit();
                          return true;
                        }
                      }
                      else if (paramString.startsWith("//tgs "))
                      {
                        String str25 = paramString.replace("//tgs ", "");
                        if (!TextUtils.isEmpty(str25))
                        {
                          if ("on".equals(str25))
                          {
                            paramContext.getSharedPreferences(ak.aHi(), 0).edit().putBoolean("turngamesound", true).commit();
                            return true;
                          }
                          if ("off".equals(str25))
                          {
                            paramContext.getSharedPreferences(ak.aHi(), 0).edit().putBoolean("turngamesound", false).commit();
                            return true;
                          }
                        }
                      }
                      else if (paramString.startsWith("//testMbanner"))
                      {
                        try
                        {
                          String[] arrayOfString4 = paramString.replace("//testMbanner ", "").split(",");
                          if (arrayOfString4.length < 2)
                            continue;
                          bt.rn().a(new bs(Integer.valueOf(arrayOfString4[0]).intValue(), Integer.valueOf(arrayOfString4[1]).intValue(), null));
                          return true;
                        }
                        catch (Exception localException7)
                        {
                          return true;
                        }
                      }
                      else
                      {
                        if (paramString.startsWith("//recomT"))
                          try
                          {
                            String str24 = paramString.replace("//recomT ", "");
                            bg.qW().px().a(str24, true, null);
                            return true;
                          }
                          catch (Exception localException6)
                          {
                            return true;
                          }
                        if (paramString.startsWith("//recomF"))
                          try
                          {
                            String str23 = paramString.replace("//recomF ", "");
                            bg.qW().px().a(str23, false, null);
                            return true;
                          }
                          catch (Exception localException5)
                          {
                            return true;
                          }
                        if (paramString.startsWith("//testgetreg"))
                          try
                          {
                            String[] arrayOfString3 = paramString.replace("//testgetreg ", "").split(",");
                            if (arrayOfString3.length > 2)
                            {
                              new com.tencent.mm.model.cr().cT(Integer.valueOf(arrayOfString3[0]).intValue()).cV(Integer.valueOf(arrayOfString3[1]).intValue()).cU(Integer.valueOf(arrayOfString3[2]).intValue()).commit();
                              return true;
                            }
                          }
                          catch (Exception localException4)
                          {
                            return true;
                          }
                      }
                    }
                  }
                }
              }
            }
            if (paramString.startsWith("//testwaitsms"))
              try
              {
                Intent localIntent4 = new Intent();
                localIntent4.setClass(paramContext, RegByMobileWaitingSMSUI.class);
                localIntent4.putExtra("bindmcontact_mobile", "+8613186086906");
                paramContext.startActivity(localIntent4);
                return true;
              }
              catch (Exception localException3)
              {
                return true;
              }
            if (paramString.startsWith("//new emoji"))
            {
              com.tencent.mm.k.i.Ck().d(262147, true);
              bg.qW().oQ().set(229633, "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM5eOptD4jIj72I8icMVEKwzSYkC30IgjMvSibGfqsEdy0ibXayiaZtbibSXV5EPZEWILOvbrjjLtQ9P4QQ/0");
              bg.qW().oQ().set(229634, System.currentTimeMillis());
              return true;
            }
            if (paramString.startsWith("//free emoji"))
            {
              com.tencent.mm.k.i.Ck().d(262149, true);
              bg.qW().oQ().set(229633, "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM5eOptD4jIj72I8icMVEKwzSYkC30IgjMvSibGfqsEdy0ibXayiaZtbibSXV5EPZEWILOvbrjjLtQ9P4QQ/0");
              bg.qW().oQ().set(229634, System.currentTimeMillis());
              return true;
            }
            if (!paramString.startsWith("//facing "))
              break;
            str22 = paramString.replace("//facing ", "");
          }
          while (TextUtils.isEmpty(str22));
          if ("t".equals(str22))
          {
            bg.qW().oQ().set(262151, Boolean.valueOf(true));
            return true;
          }
          if ("f".equals(str22))
          {
            bg.qW().oQ().set(262151, Boolean.valueOf(false));
            return true;
          }
          bg.qW().oQ().set(262151, "text");
          return true;
          if (paramString.startsWith("//share "))
          {
            int i3 = Integer.valueOf(paramString.replace("//share ", "")).intValue();
            bg.qW().oQ().set(229635, Integer.valueOf(i3));
            return true;
          }
          if (paramString.startsWith("//dumpappinfoblob "))
          {
            String str21 = paramString.replace("//dumpappinfoblob ", "");
            com.tencent.mm.pluginsdk.model.app.k localk1 = com.tencent.mm.pluginsdk.model.app.bf.GO().uY(str21);
            com.tencent.mm.ui.base.e.o(paramContext, localk1.iz() + "\n" + localk1.iF() + "\n" + localk1.iG(), "");
            return true;
          }
          if (!paramString.startsWith("//googleauth "))
            break;
          str20 = paramString.replace("//googleauth ", "");
        }
        while (TextUtils.isEmpty(str20));
        if ("webview".equals(str20))
        {
          paramContext.getSharedPreferences(ak.aHi(), 0).edit().putBoolean("googleauth", true).commit();
          return true;
        }
      }
      while (!"local".equals(str20));
      paramContext.getSharedPreferences(ak.aHi(), 0).edit().putBoolean("googleauth", false).commit();
      return true;
      if (!paramString.startsWith("//clrgamecache"))
        break;
      localac = com.tencent.mm.pluginsdk.g.axX();
    }
    while (localac == null);
    localac.aJ(paramContext);
    return true;
    if (paramString.startsWith("//googlemap"))
    {
      com.tencent.mm.platformtools.ao.dWe = true;
      return true;
    }
    if (paramString.startsWith("//sosomap"))
    {
      com.tencent.mm.platformtools.ao.dWe = false;
      return true;
    }
    if (paramString.startsWith("//opentrace"))
    {
      new com.tencent.mm.ui.applet.s();
      com.tencent.mm.ui.applet.s.cm(ak.getContext());
      return true;
    }
    label2731: ar localar;
    com.tencent.mm.storage.s locals;
    String str19;
    r localr;
    if (paramString.startsWith("//updateConversation"))
    {
      z.i("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "update all conversation start");
      Iterator localIterator = bg.qW().oW().aIG().iterator();
      while (localIterator.hasNext())
      {
        String str18 = (String)localIterator.next();
        localar = bg.qW().oV().bt(str18, " and not ( type = 10000 and isSend != 2 ) ");
        locals = bg.qW().oW();
        str19 = localar.kt();
        localr = locals.yE(str19);
        if ((localr != null) && (localr.jM() > localar.kn()) && (localr.jM() != 9223372036854775807L))
        {
          z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
        }
        else
        {
          if (localr != null)
            break label4835;
          localr = new r(str19);
        }
      }
    }
    label4835: for (int i2 = 1; ; i2 = 0)
    {
      localr.bv(localar.jK());
      localr.bt(localr.jI());
      localr.v(localar);
      localr.bv(Integer.toString(localar.getType()));
      localr.l(0x0 & localr.jP() | 0xFFFFFFFF & localar.kn());
      if (i2 != 0)
      {
        locals.d(localr);
        break label2731;
      }
      locals.a(localr, str19);
      break label2731;
      z.i("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "update all conversation end");
      return true;
      if (paramString.startsWith("//recover"))
      {
        String str15 = com.tencent.mm.a.f.d((v.ng() + bg.qW().oD()).getBytes()).substring(0, 7);
        String str16 = paramString.replace("//recover", "");
        int i1;
        String str17;
        if (com.tencent.mm.sdk.platformtools.ch.jb(str16))
        {
          String[] arrayOfString2 = new File(bg.qW().pt()).list();
          int n = arrayOfString2.length;
          i1 = 0;
          if (i1 < n)
          {
            str17 = arrayOfString2[i1];
            if (!str17.startsWith("EnMicroMsg.db" + "err"))
              break label3174;
          }
        }
        for (str16 = bg.qW().pt() + str17; ; str16 = str16.replaceFirst(" ", ""))
        {
          if ((!com.tencent.mm.sdk.platformtools.ch.jb(str16)) && (new File(str16).exists()))
            break label3194;
          Toast.makeText(ak.getContext(), ak.getContext().getString(n.bXM), 1).show();
          z.i("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "crash file is not exists");
          return true;
          label3174: i1++;
          break;
        }
        label3194: File localFile2 = new File(str16);
        long l1 = 2L * localFile2.length();
        StatFs localStatFs = new StatFs(com.tencent.mm.compatible.g.m.getDataDirectory().getPath());
        long l2 = localStatFs.getAvailableBlocks() * localStatFs.getBlockSize();
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Long.valueOf(l1);
        arrayOfObject4[1] = Long.valueOf(l2);
        z.i("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "db recover needSize : %d blockSize:%d", arrayOfObject4);
        if (l2 < l1)
        {
          Toast.makeText(ak.getContext(), ak.getContext().getString(n.bXN), 1).show();
          return true;
        }
        Activity localActivity = ak.aHg();
        ak.getContext().getString(n.buo);
        com.tencent.mm.ui.base.cr localcr = com.tencent.mm.ui.base.e.a(localActivity, ak.getContext().getString(n.bXL), false, null);
        bg.qQ().aHo();
        bg.qQ().n(new f(localFile2, str15, localcr));
        localcr.show();
        return true;
      }
      if (paramString.startsWith("//makesnsdata "))
      {
        int m = Integer.parseInt(paramString.replace("//makesnsdata ", ""));
        com.tencent.mm.pluginsdk.am.aym().ca(m);
        return true;
      }
      if (paramString.startsWith("//resetsnstip"))
      {
        bg.qW().oQ().set(327776, Integer.valueOf(0));
        return true;
      }
      if (paramString.startsWith("//changeframe "))
      {
        String str14 = paramString.replace("//changeframe ", "");
        ak.getContext().getSharedPreferences("preferences_animation", 0).edit().putFloat("frameInterval", Float.valueOf(str14).floatValue()).commit();
        return true;
      }
      if (paramString.startsWith("//opendumpview"))
      {
        new com.tencent.mm.ui.applet.h();
        Context localContext = ak.getContext();
        new com.tencent.mm.ui.applet.i(localContext, LayoutInflater.from(localContext).inflate(com.tencent.mm.k.boK, null)).show();
        return true;
      }
      if (paramString.startsWith("//dumpmemory"))
      {
        com.tencent.mm.at.a.aNX();
        com.tencent.mm.at.a.v(false, true);
        return true;
      }
      if (paramString.startsWith("//dumpsnsfile"))
      {
        ki localki = new ki();
        com.tencent.mm.sdk.c.a.aGB().g(localki);
        return true;
      }
      if (paramString.startsWith("//coverage"))
      {
        String str10 = paramString.trim().substring(10);
        File localFile1 = new File("/sdcard/cov.txt");
        if (!localFile1.exists())
        {
          z.w("!56@/B4Tb64lLpK+IBX8XDgnvklqRB2dT0TuJY35uR698qNAQ+vAl+Ie1Q==", "codecoverage checkUpload dir never create ?");
          return true;
        }
        String str11 = com.tencent.mm.model.bf.dkH.z("login_user_name", "never_login_crash");
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("#username=" + str11);
        localStringBuffer.append("\n");
        localStringBuffer.append("#rev=798589");
        localStringBuffer.append("\n");
        localStringBuffer.append("#path=https://scm-gy.tencent.com/gzrd/gzrd_mail_rep/MicroMsg_proj/branches/android/RB-5.4-v2");
        localStringBuffer.append("\n");
        if (str10.length() > 0)
        {
          localStringBuffer.append("#startrev=" + str10);
          localStringBuffer.append("\n");
        }
        com.tencent.mm.a.c.a(localFile1.getAbsolutePath(), localStringBuffer.toString().getBytes());
        String str12 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        String str13 = com.tencent.mm.a.l.a(localFile1, false, "/sdcard/cov/cov_" + str12 + ".zip");
        if (str13 == null)
        {
          z.e("!56@/B4Tb64lLpK+IBX8XDgnvklqRB2dT0TuJY35uR698qNAQ+vAl+Ie1Q==", "zip file failed");
          return true;
        }
        localFile1.delete();
        z.i("!56@/B4Tb64lLpK+IBX8XDgnvklqRB2dT0TuJY35uR698qNAQ+vAl+Ie1Q==", "code coverage try upload :" + str11);
        com.tencent.mm.platformtools.am.a(str13, str11, false, false, 10, 20004);
        return true;
      }
      if (paramString.startsWith("//pickpoi"))
      {
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("map_view_type", 8);
        com.tencent.mm.am.a.b(paramContext, "location", ".ui.RedirectUI", localIntent2);
        return true;
      }
      if (paramString.startsWith("//configlist"))
      {
        if (paramString.matches("^//configlist set ([\\S]*)=([\\S]*)$"))
        {
          List localList2 = ap.aa(paramString, "^//configlist set ([\\S]*)=([\\S]*)$");
          if ((localList2 == null) || (localList2.size() != 2))
            break;
          String str8 = (String)localList2.get(0);
          String str9 = (String)localList2.get(1);
          com.tencent.mm.f.e.or().put(str8, str9);
          com.tencent.mm.c.a.av localav = new com.tencent.mm.c.a.av();
          com.tencent.mm.sdk.c.a.aGB().g(localav);
          return true;
        }
        if (!paramString.matches("^//configlist get ([\\S]*)$"))
          break;
        List localList1 = ap.aa(paramString, "^//configlist get ([\\S]*)$");
        if ((localList1 == null) || (localList1.size() != 1))
          break;
        String str6 = (String)localList1.get(0);
        String str7 = com.tencent.mm.f.e.or().getValue(str6);
        Toast.makeText(paramContext, str6 + "=" + str7, 0).show();
        return true;
      }
      if (paramString.startsWith("//security"))
        try
        {
          String str5 = paramString.replace("//security ", "");
          bg.qW().py().a(str5, true, null);
          return true;
        }
        catch (Exception localException2)
        {
          return true;
        }
      if (paramString.startsWith("//updatepackage"))
        try
        {
          com.tencent.mm.ad.k localk = new com.tencent.mm.ad.k(Integer.parseInt(paramString.replace("//updatepackage ", "").trim()));
          bg.qX().d(localk);
          return true;
        }
        catch (Exception localException1)
        {
          return true;
        }
      if (paramString.startsWith("//audiowritetofile"))
      {
        v.dNC.dLG = true;
        return true;
      }
      if (paramString.startsWith("//bankcard"))
      {
        Intent localIntent3 = new Intent();
        localIntent3.putExtra("BaseScanUI_select_scan_mode", 7);
        localIntent3.putExtra("bank_card_owner", "test");
        com.tencent.mm.am.a.b((Activity)paramContext, "scanner", ".ui.BaseScanUI", localIntent3);
        return true;
      }
      int k = fk(paramString);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(k);
      z.d("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "processed : in ret:[%d]", arrayOfObject3);
      switch (k)
      {
      default:
        return false;
      case 0:
        return false;
      case 568:
        Assert.assertTrue("test errlog", false);
        return true;
      case 569:
        bg.qW().pv();
        return true;
      case 570:
        if (!cm.Aa(iH(paramString)))
          break;
        Toast.makeText(paramContext, n.coy, 0).show();
        return true;
      case 571:
        String str4 = iH(paramString);
        bg.qW().oQ().set(8195, str4);
        return true;
      case 572:
        com.tencent.mm.sdk.platformtools.l.cFr = Integer.valueOf(iH(paramString)).intValue();
        return true;
      case 574:
        com.tencent.mm.ui.base.e.o(paramContext, com.tencent.mm.a.f.d((v.ng() + bg.qW().oD()).getBytes()), "md5");
        return true;
      case 579:
        String str3 = iH(paramString);
        at.qx().ec(str3);
        return true;
      case 580:
        bg.qX().d(new ce(new i()));
        return true;
      case 581:
        String str2 = iH(paramString);
        com.tencent.mm.pluginsdk.model.app.bf.aza().uX(str2);
        return true;
      case 582:
        String str1 = iH(paramString);
        com.tencent.mm.storage.i locali1 = bg.qW().oT().ys(str1);
        if ((locali1 == null) || ((int)locali1.dhv == 0))
          return false;
        locali1.oz();
        com.tencent.mm.model.y.n(locali1);
        return true;
      case 583:
        bg.qW().pw();
        return true;
      case 584:
      case 585:
        com.tencent.mm.model.ch.eq(iH(paramString));
        return true;
      case 586:
        String[] arrayOfString1 = paramString.split(" ");
        if ((arrayOfString1 == null) || (arrayOfString1.length != 3))
          break;
        u.B(Integer.parseInt(arrayOfString1[1]), Integer.parseInt(arrayOfString1[2]));
        return true;
      case 587:
        au localau = new au();
        com.tencent.mm.sdk.c.a.aGB().g(localau);
        return true;
      case 588:
        com.tencent.mm.a.c.ae("/sdcard/tencent/MicroMsg/back");
        p.f(bg.qW().pt(), "/sdcard/tencent/MicroMsg/back", false);
        return true;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b
 * JD-Core Version:    0.6.2
 */