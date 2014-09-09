package com.tencent.mm.ui.tools;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.mm.am.a;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareToTimeLineUI extends MMActivity
{
  private ArrayList A(Bundle paramBundle)
  {
    ArrayList localArrayList1 = paramBundle.getParcelableArrayList("android.intent.extra.STREAM");
    ArrayList localArrayList2;
    Uri localUri;
    Cursor localCursor;
    if ((localArrayList1 != null) && (localArrayList1.size() > 0))
    {
      localArrayList2 = new ArrayList();
      Iterator localIterator = localArrayList1.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localUri = (Uri)localIterator.next();
          if ((localUri != null) && (localUri.getScheme() != null))
            if (localUri.getScheme().startsWith("content"))
            {
              localCursor = getContentResolver().query(localUri, null, null, null, null);
              if (localCursor == null)
              {
                z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "null cursor");
                continue;
              }
              if (!localCursor.moveToFirst())
                break label247;
            }
        }
    }
    label245: label247: for (String str = localCursor.getString(localCursor.getColumnIndexOrThrow("_data")); ; str = "")
    {
      localCursor.close();
      while (true)
      {
        if (ch.jb(str))
          break label245;
        z.i("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "multisend file path: " + str);
        localArrayList2.add(str);
        break;
        if (localUri.getScheme().startsWith("file"))
        {
          str = localUri.getPath();
          continue;
          int i = localArrayList2.size();
          ArrayList localArrayList3 = null;
          if (i > 0)
            localArrayList3 = localArrayList2;
          return localArrayList3;
          z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "getParcelableArrayList failed");
          return null;
        }
        else
        {
          str = "";
        }
      }
      break;
    }
  }

  private static boolean Dp(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return false;
    return ch.xG(paramString);
  }

  private void bM(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    if (!ch.jb(paramString1))
    {
      localIntent.putExtra("sns_kemdia_path", paramString1);
      localIntent.putExtra("KFilterId", -1);
    }
    if (!ch.jb(paramString2))
      localIntent.putExtra("Kdescription", paramString2);
    if ((bg.ra()) && (!bg.rd()))
      a.b(this, "sns", ".ui.SnsUploadUI", localIntent);
    while (true)
    {
      finish();
      return;
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
    }
  }

  private void baU()
  {
    Toast.makeText(this, n.ciN, 1).show();
  }

  private String f(Uri paramUri)
  {
    if (paramUri == null)
    {
      z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "uri is null");
      return null;
    }
    String str1 = paramUri.getScheme();
    if (str1 == null)
      return null;
    if (str1.equalsIgnoreCase("file"))
    {
      z.i("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "getFilePath : scheme is SCHEME_FILE");
      return paramUri.getPath();
    }
    if (str1.equalsIgnoreCase("content"))
    {
      z.i("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "getFilePath : scheme is SCHEME_CONTENT: " + paramUri.toString());
      Cursor localCursor;
      try
      {
        localCursor = getContentResolver().query(paramUri, null, null, null, null);
        if (localCursor == null)
        {
          z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "getFilePath : fail, cursor is null");
          return null;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "error in getContentResolver().query() : uri = " + paramUri);
        return null;
      }
      if ((localCursor.getCount() <= 0) || (!localCursor.moveToFirst()))
      {
        localCursor.close();
        z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
        return null;
      }
      int i = localCursor.getColumnIndex("_data");
      if (i == -1)
      {
        localCursor.close();
        z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
        return null;
      }
      String str2 = localCursor.getString(i);
      localCursor.close();
      return str2;
    }
    z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "unknown scheme");
    return null;
  }

  protected final void DP()
  {
    Intent localIntent1 = getIntent();
    if (localIntent1 == null)
    {
      z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "launch : fail, intent is null");
      baU();
      finish();
      return;
    }
    String str1 = localIntent1.getAction();
    Bundle localBundle = localIntent1.getExtras();
    if (ch.jb(str1))
    {
      z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "launch : fail, action is null");
      baU();
      finish();
      return;
    }
    String str2 = localIntent1.getStringExtra("Kdescription");
    String str3 = getIntent().resolveType(this);
    if (ch.jb(str3))
    {
      baU();
      finish();
      return;
    }
    if (!str3.contains("image"))
    {
      baU();
      finish();
      return;
    }
    if ((str1.equals("android.intent.action.SEND")) && (localBundle != null))
    {
      z.i("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "send signal: " + str1);
      Parcelable localParcelable = localBundle.getParcelable("android.intent.extra.STREAM");
      if ((localParcelable == null) || (!(localParcelable instanceof Uri)))
      {
        baU();
        finish();
        return;
      }
      String str4 = f((Uri)localParcelable);
      if ((ch.jb(str4)) || (!Dp(str4)))
      {
        if (localIntent1.getBooleanExtra("Ksnsupload_empty_img", false))
        {
          bM(str4, str2);
          return;
        }
        baU();
        finish();
        return;
      }
      if (!Dp(str4))
      {
        baU();
        finish();
        return;
      }
      bM(str4, str2);
      return;
    }
    if ((str1.equals("android.intent.action.SEND_MULTIPLE")) && (localBundle != null) && (localBundle.containsKey("android.intent.extra.STREAM")))
    {
      z.i("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "send multi: " + str1);
      ArrayList localArrayList = A(localBundle);
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        baU();
        finish();
        return;
      }
      Intent localIntent2 = new Intent();
      if ((localArrayList != null) && (localArrayList.size() > 0))
      {
        if (localArrayList.size() > 9)
          localArrayList.subList(9, localArrayList.size()).clear();
        localIntent2.putStringArrayListExtra("sns_kemdia_path_list", localArrayList);
      }
      if (!ch.jb(str2))
        localIntent2.putExtra("Kdescription", str2);
      if ((bg.ra()) && (!bg.rd()))
        a.b(this, "sns", ".ui.SnsUploadUI", localIntent2);
      while (true)
      {
        finish();
        return;
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
      }
    }
    z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "launch : fail, uri is null");
    baU();
    finish();
  }

  protected final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bt("");
    int i = getIntent().getIntExtra("wizard_activity_result_code", 0);
    switch (i)
    {
    default:
      z.e("!44@/B4Tb64lLpJVtS9qfp1qlfW9cqf1Mxpi6U2Uj2Hibvo=", "onCreate, should not reach here, resultCode = " + i);
      finish();
      return;
    case 1:
      finish();
      return;
    case -1:
    case 0:
    }
    NotifyReceiver.lw();
    bg.qX().d(new ce(new gr(this)));
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareToTimeLineUI
 * JD-Core Version:    0.6.2
 */