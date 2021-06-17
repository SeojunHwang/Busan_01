package com.btc.board1.common;

import java.io.File;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.btc.board1.dto.Board1FileDto;

@Component
public class FileUtils {
	
	public List<Board1FileDto> parseFileInfo(int boardIdx, MultipartHttpServletRequest mhsr) throws Exception {
		if (ObjectUtils.isEmpty(mhsr)) {
			return null;
		}
		
		List<Board1FileDto> fileList = new ArrayList<>();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
		ZonedDateTime current = ZonedDateTime.now();
		String path = "images/" + current.format(format);
		
		File file = new File(path);
		
		if (file.exists() == false) {
			file.mkdirs();
		}
		
		Iterator<String> iterator = mhsr.getFileNames();
		String newFileName;
		String originalFileExtension;
		String contentType;
		
		while(iterator.hasNext()) {
			List<MultipartFile> list = mhsr.getFiles(iterator.next());
			
			for (MultipartFile multiFile : list) {
				if (multiFile.isEmpty() == false) {
					contentType = multiFile.getContentType();
					
					if (ObjectUtils.isEmpty(contentType)) {
						break;
					}
					else {
						if (contentType.contains("image/jpeg")) {
							originalFileExtension = ".jpg";
						}
						else if (contentType.contains("image/png")) {
							originalFileExtension = ".png";
						}
						else if (contentType.contains("image/gif")) {
							originalFileExtension = ".gif";
						}
						else {
							break;
						}
					}
					
					newFileName = Long.toString(System.nanoTime()) + originalFileExtension;
					
					Board1FileDto boardFile = new Board1FileDto();
					boardFile.setBoardIdx(boardIdx);
					boardFile.setFileSize(multiFile.getSize());
					boardFile.setOriginalFileName(multiFile.getOriginalFilename());
					boardFile.setStoredFilePath(path + "/" + newFileName);
					
					fileList.add(boardFile);
					
					file = new File(path + "/" + newFileName);
					multiFile.transferTo(file);
				}
			}
		}
		return fileList;
	}
}

















