package com.iqmsoft.hadoop.pig;

import java.util.Collection;

public interface PasswordRepository {

	void processPasswordFile(String inputFile);

	void processPasswordFiles(Collection<String> inputFiles);

}