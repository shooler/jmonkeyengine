package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1865</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRScreenshots_FnTable extends Structure {
	/** C type : RequestScreenshot_callback* */
	public VR_IVRScreenshots_FnTable.RequestScreenshot_callback RequestScreenshot;
	/** C type : HookScreenshot_callback* */
	public VR_IVRScreenshots_FnTable.HookScreenshot_callback HookScreenshot;
	/** C type : GetScreenshotPropertyType_callback* */
	public VR_IVRScreenshots_FnTable.GetScreenshotPropertyType_callback GetScreenshotPropertyType;
	/** C type : GetScreenshotPropertyFilename_callback* */
	public VR_IVRScreenshots_FnTable.GetScreenshotPropertyFilename_callback GetScreenshotPropertyFilename;
	/** C type : UpdateScreenshotProgress_callback* */
	public VR_IVRScreenshots_FnTable.UpdateScreenshotProgress_callback UpdateScreenshotProgress;
	/** C type : TakeStereoScreenshot_callback* */
	public VR_IVRScreenshots_FnTable.TakeStereoScreenshot_callback TakeStereoScreenshot;
	/** C type : SubmitScreenshot_callback* */
	public VR_IVRScreenshots_FnTable.SubmitScreenshot_callback SubmitScreenshot;
	/** <i>native declaration : headers\openvr_capi.h:1858</i> */
	public interface RequestScreenshot_callback extends Callback {
		int apply(IntByReference pOutScreenshotHandle, int type, Pointer pchPreviewFilename, Pointer pchVRFilename);
	};
	/** <i>native declaration : headers\openvr_capi.h:1859</i> */
	public interface HookScreenshot_callback extends Callback {
		int apply(IntByReference pSupportedTypes, int numTypes);
	};
	/** <i>native declaration : headers\openvr_capi.h:1860</i> */
	public interface GetScreenshotPropertyType_callback extends Callback {
		int apply(int screenshotHandle, IntByReference pError);
	};
	/** <i>native declaration : headers\openvr_capi.h:1861</i> */
	public interface GetScreenshotPropertyFilename_callback extends Callback {
		int apply(int screenshotHandle, int filenameType, Pointer pchFilename, int cchFilename, IntByReference pError);
	};
	/** <i>native declaration : headers\openvr_capi.h:1862</i> */
	public interface UpdateScreenshotProgress_callback extends Callback {
		int apply(int screenshotHandle, float flProgress);
	};
	/** <i>native declaration : headers\openvr_capi.h:1863</i> */
	public interface TakeStereoScreenshot_callback extends Callback {
		int apply(IntByReference pOutScreenshotHandle, Pointer pchPreviewFilename, Pointer pchVRFilename);
	};
	/** <i>native declaration : headers\openvr_capi.h:1864</i> */
	public interface SubmitScreenshot_callback extends Callback {
		int apply(int screenshotHandle, int type, Pointer pchSourcePreviewFilename, Pointer pchSourceVRFilename);
	};
	public VR_IVRScreenshots_FnTable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("RequestScreenshot", "HookScreenshot", "GetScreenshotPropertyType", "GetScreenshotPropertyFilename", "UpdateScreenshotProgress", "TakeStereoScreenshot", "SubmitScreenshot");
	}
	/**
	 * @param RequestScreenshot C type : RequestScreenshot_callback*<br>
	 * @param HookScreenshot C type : HookScreenshot_callback*<br>
	 * @param GetScreenshotPropertyType C type : GetScreenshotPropertyType_callback*<br>
	 * @param GetScreenshotPropertyFilename C type : GetScreenshotPropertyFilename_callback*<br>
	 * @param UpdateScreenshotProgress C type : UpdateScreenshotProgress_callback*<br>
	 * @param TakeStereoScreenshot C type : TakeStereoScreenshot_callback*<br>
	 * @param SubmitScreenshot C type : SubmitScreenshot_callback*
	 */
	public VR_IVRScreenshots_FnTable(VR_IVRScreenshots_FnTable.RequestScreenshot_callback RequestScreenshot, VR_IVRScreenshots_FnTable.HookScreenshot_callback HookScreenshot, VR_IVRScreenshots_FnTable.GetScreenshotPropertyType_callback GetScreenshotPropertyType, VR_IVRScreenshots_FnTable.GetScreenshotPropertyFilename_callback GetScreenshotPropertyFilename, VR_IVRScreenshots_FnTable.UpdateScreenshotProgress_callback UpdateScreenshotProgress, VR_IVRScreenshots_FnTable.TakeStereoScreenshot_callback TakeStereoScreenshot, VR_IVRScreenshots_FnTable.SubmitScreenshot_callback SubmitScreenshot) {
		super();
		this.RequestScreenshot = RequestScreenshot;
		this.HookScreenshot = HookScreenshot;
		this.GetScreenshotPropertyType = GetScreenshotPropertyType;
		this.GetScreenshotPropertyFilename = GetScreenshotPropertyFilename;
		this.UpdateScreenshotProgress = UpdateScreenshotProgress;
		this.TakeStereoScreenshot = TakeStereoScreenshot;
		this.SubmitScreenshot = SubmitScreenshot;
	}
	public VR_IVRScreenshots_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRScreenshots_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRScreenshots_FnTable implements Structure.ByValue {
		
	};
}