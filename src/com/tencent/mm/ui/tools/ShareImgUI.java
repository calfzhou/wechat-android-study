package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.mm.a.c;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.modelmsg.WXFileObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.WXTextObject;
import com.tencent.mm.sdk.modelmsg.j;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import com.tencent.mm.ui.transmit.SendAppMessageWrapperUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareImgUI extends MMActivity
{
  private ProgressDialog dWT = null;
  String filePath = null;
  private cm gQj = new gn(this);
  private Intent intent = null;
  private gp jUS;
  ArrayList jUT = null;
  String text = null;
  Uri uri = null;

  private ArrayList A(Bundle paramBundle)
  {
    ArrayList localArrayList1 = paramBundle.getParcelableArrayList("android.intent.extra.STREAM");
    ArrayList localArrayList2;
    Uri localUri;
    Cursor localCursor;
    label110: int i;
    label113: label118: String str1;
    if ((localArrayList1 != null) && (localArrayList1.size() > 0))
    {
      localArrayList2 = new ArrayList();
      Iterator localIterator = localArrayList1.iterator();
      if (localIterator.hasNext())
      {
        localUri = (Uri)localIterator.next();
        if ((localUri != null) && (localUri.getScheme() != null))
        {
          if (!localUri.getScheme().startsWith("content"))
            break label328;
          localCursor = getContentResolver().query(localUri, null, null, null, null);
          if (localCursor == null)
            z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "null cursor");
        }
        else
        {
          i = 0;
          if (i != 0)
            break label326;
          return null;
        }
        if (localCursor.moveToFirst())
        {
          int j = localCursor.getColumnIndex("_data");
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(j);
          z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "getMultiSendFilePath  dataColumnIndex:[%d]", arrayOfObject1);
          if (j > 0)
          {
            str1 = localCursor.getString(j);
            int k = localCursor.getColumnIndex("mime_type");
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(j);
            z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "getMultiSendFilePath  typeColumnIndex:[%d]", arrayOfObject2);
            if (k <= 0)
              break label384;
          }
        }
      }
    }
    label384: for (String str2 = localCursor.getString(localCursor.getColumnIndexOrThrow("mime_type")); ; str2 = null)
    {
      if ((str2 == null) || (!str2.contains("image")))
      {
        localCursor.close();
        break label110;
        localCursor.close();
        break label110;
        str1 = "";
      }
      localCursor.close();
      while (true)
      {
        if (ch.jb(str1))
          break label382;
        z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "multisend file path: " + str1);
        localArrayList2.add(str1);
        i = 1;
        break label113;
        label326: break;
        label328: if (localUri.getScheme().startsWith("file"))
        {
          str1 = localUri.getPath();
          if (!ch.xx(str1))
            break label110;
          continue;
          if (localArrayList2.size() <= 0)
            break label118;
          return localArrayList2;
          z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "getParcelableArrayList failed");
          return null;
        }
        str1 = "";
      }
      label382: break label110;
    }
  }

  private String a(Uri paramUri, Cursor paramCursor)
  {
    String str1;
    if (paramUri != null)
    {
      str1 = "contact.vcf";
      int i = paramCursor.getColumnIndex("_display_name");
      if (i != -1)
      {
        str1 = paramCursor.getString(i);
        if ((str1 != null) && (str1 != null))
          str1 = str1.replaceAll("[^.\\w]+", "_");
        z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "vcard file name: " + str1);
      }
      paramCursor.close();
    }
    String str3;
    try
    {
      AssetFileDescriptor localAssetFileDescriptor = getContentResolver().openAssetFileDescriptor(paramUri, "r");
      FileInputStream localFileInputStream = localAssetFileDescriptor.createInputStream();
      byte[] arrayOfByte = new byte[(int)localAssetFileDescriptor.getDeclaredLength()];
      if (localFileInputStream.read(arrayOfByte) > 0)
      {
        if (!bg.qW().isSDCardAvailable())
        {
          deleteFile(str1);
          FileOutputStream localFileOutputStream = openFileOutput(str1, 0);
          localFileOutputStream.write(arrayOfByte);
          localFileOutputStream.flush();
          localFileOutputStream.close();
          return getFilesDir().getPath() + "/" + str1;
        }
        String str2 = h.dOI + "share";
        str3 = h.dOI + "share/" + str1;
        File localFile1 = new File(str2);
        if (!localFile1.exists())
          localFile1.mkdir();
        File localFile2 = new File(str3);
        if (!localFile2.exists())
          localFile2.createNewFile();
        if (c.a(str3, arrayOfByte, arrayOfByte.length) == 0);
      }
      else
      {
        localFileInputStream.close();
        localAssetFileDescriptor.close();
        return null;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "vcard uri file not found " + localFileNotFoundException.getMessage());
    }
    catch (IOException localIOException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "vcard uri ioexception" + localIOException.getMessage());
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "vcard uri exception" + localException.getMessage());
    }
    return str3;
  }

  private void bL(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "dealWithFile fail, filePath is empty");
      return;
    }
    int i = c.ab(paramString1);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "filelength: [%d]", arrayOfObject);
    if (i == 0)
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "dealWithFile fail, fileLength is 0");
      return;
    }
    if (i > 10485760)
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "dealWithFile fail, fileLength is too large");
      Toast.makeText(this, n.ciK, 1).show();
      return;
    }
    WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXFileObject(paramString1));
    localWXMediaMessage.title = new File(paramString1).getName();
    if (paramString2 != null)
      if (paramString2.length() > 0)
      {
        localWXMediaMessage.description = paramString2;
        if (i >= 30720)
          break label304;
        localWXMediaMessage.thumbData = c.a(paramString1, 0, -1);
      }
    while (true)
    {
      j localj = new j();
      localj.hvw = null;
      localj.iDh = localWXMediaMessage;
      Bundle localBundle = new Bundle();
      localj.d(localBundle);
      localBundle.putInt("_mmessage_sdkVersion", 570490883);
      localBundle.putString("_mmessage_appPackage", "com.tencent.mm.openapi");
      localBundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
      Intent localIntent = new Intent();
      localIntent.setClass(this, SelectConversationUI.class);
      localIntent.putExtra("Select_Conv_NextStep", new Intent(this, SendAppMessageWrapperUI.class).putExtras(localBundle));
      if ((!bg.ra()) || (bg.rd()))
        break label328;
      startActivity(localIntent);
      return;
      localWXMediaMessage.description = ch.Z(i);
      break;
      label304: z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "thumb data is exceed 30k, ignore");
      continue;
      localWXMediaMessage.description = ch.Z(i);
    }
    label328: z.w("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "not logged in, jump to simple login");
    MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
  }

  private void baT()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.filePath;
    z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "filepath:[%s]", arrayOfObject);
    Intent localIntent = getIntent();
    String str1 = localIntent.resolveType(this);
    int i;
    if ((str1 == null) || (str1.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "map : mimeType is null");
      i = -1;
    }
    while (i == -1)
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "launch, msgType is invalid");
      finish();
      return;
      String str2 = str1.toLowerCase();
      if (str2.contains("image"))
      {
        i = 0;
      }
      else if (str2.contains("video"))
      {
        i = 1;
      }
      else
      {
        z.d("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "map : unknown mimetype, send as file");
        i = 3;
      }
    }
    if ((i == 3) && (!ch.jb(this.filePath)))
    {
      bL(this.filePath, null);
      finish();
      return;
    }
    if ((this.text != null) && (i == 0) && (!ch.jb(this.filePath)))
    {
      bL(this.filePath, this.text);
      finish();
      return;
    }
    if ((!getIntent().getBooleanExtra("Intro_Switch", false)) && (bg.ra()) && (!bg.rd()))
    {
      localIntent.setData(this.uri);
      localIntent.setClass(this, MsgRetransmitUI.class);
      localIntent.putExtra("Retr_File_Name", this.filePath);
      localIntent.putStringArrayListExtra("Retr_File_Path_List", this.jUT);
      localIntent.putExtra("Retr_Msg_Type", i);
      localIntent.putExtra("Retr_Scene", 1);
      startActivity(localIntent);
    }
    while (true)
    {
      finish();
      return;
      localIntent.putExtras(getIntent());
      localIntent.addFlags(67108864);
      localIntent.setType(getIntent().getType());
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), localIntent);
    }
  }

  private void baU()
  {
    rl(0);
    Toast.makeText(this, n.ciL, 1).show();
  }

  private void rl(int paramInt)
  {
    switch (paramInt)
    {
    default:
      Toast.makeText(this, n.ciL, 1).show();
      return;
    case 1:
    }
    Toast.makeText(this, n.ciJ, 1).show();
  }

  protected final void DP()
  {
    this.intent = getIntent();
    if (this.intent == null)
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "launch : fail, intent is null");
      baU();
      finish();
      return;
    }
    String str1 = this.intent.getAction();
    Bundle localBundle1 = this.intent.getExtras();
    if (ch.jb(str1))
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "launch : fail, action is null");
      baU();
      finish();
      return;
    }
    this.text = this.intent.getStringExtra("android.intent.extra.TEXT");
    if (localBundle1 != null)
    {
      Parcelable localParcelable = localBundle1.getParcelable("android.intent.extra.STREAM");
      if ((localParcelable != null) && ((localParcelable instanceof Uri)))
        this.uri = ((Uri)localParcelable);
    }
    if (str1.equals("android.intent.action.SEND"))
    {
      z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "send signal: " + str1);
      if (this.uri == null)
      {
        Intent localIntent1 = getIntent();
        if (localIntent1 == null)
          z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "intent is null");
        String str3;
        for (boolean bool = false; ; bool = false)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Boolean.valueOf(bool);
          z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "dealWithText: %b", arrayOfObject);
          if (!bool)
            baU();
          finish();
          return;
          str3 = localIntent1.getStringExtra("android.intent.extra.TEXT");
          if ((str3 != null) && (str3.length() != 0))
            break;
          z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "text is null");
        }
        WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXTextObject(str3));
        localWXMediaMessage.description = str3;
        j localj = new j();
        localj.hvw = null;
        localj.iDh = localWXMediaMessage;
        Bundle localBundle2 = new Bundle();
        localj.d(localBundle2);
        localBundle2.putInt("_mmessage_sdkVersion", 570490883);
        localBundle2.putString("_mmessage_appPackage", "com.tencent.mm.openapi");
        localBundle2.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        Intent localIntent2 = new Intent();
        localIntent2.setClass(this, SelectConversationUI.class);
        localIntent2.putExtra("Select_Conv_NextStep", new Intent(this, SendAppMessageWrapperUI.class).putExtras(localBundle2));
        if ((bg.ra()) && (!bg.rd()))
          startActivity(localIntent2);
        while (true)
        {
          bool = true;
          break;
          z.w("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "not logged in, jump to simple login");
          MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
        }
      }
      getString(n.buo);
      this.dWT = e.a(this, getString(n.buA), true, new go(this));
      this.jUS = new gp(this, this.uri, new gm(this));
      this.jUS.start();
      return;
    }
    if ((str1.equals("android.intent.action.SEND_MULTIPLE")) && (localBundle1 != null) && (localBundle1.containsKey("android.intent.extra.STREAM")))
    {
      z.i("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "send multi: " + str1);
      String str2 = getIntent().resolveType(this);
      if ((str2 == null) || (!str2.contains("image")))
      {
        rl(1);
        finish();
        return;
      }
      this.jUT = A(localBundle1);
      if ((this.jUT == null) || (this.jUT.size() == 0))
      {
        z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "launch : fail, filePathList is null");
        rl(1);
        finish();
        return;
      }
      baT();
      return;
    }
    z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "launch : fail, uri is null");
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
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "onCreate, should not reach here, resultCode = " + i);
      finish();
      return;
    case 1:
      finish();
      return;
    case -1:
    case 0:
    }
    NotifyReceiver.lw();
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI
 * JD-Core Version:    0.6.2
 */