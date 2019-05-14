package com.packtpub.lucenecookbook;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.core.WhitespaceAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.MMapDirectory;

public class Recipe01 {

	public static void main(String[] args) throws IOException {
		
		Analyzer analyzer = new WhitespaceAnalyzer();
		Directory directory = new MMapDirectory(Paths.get("E:\\luceneindex"));
		IndexWriterConfig config = new
				IndexWriterConfig(analyzer);
		IndexWriter indexWriter = new IndexWriter(directory, config); 
		
	}

}
