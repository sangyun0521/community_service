package practice.communityservice.domain.validation;

import lombok.RequiredArgsConstructor;
import practice.communityservice.domain.exceptions.BadRequestException;
import practice.communityservice.domain.exceptions.ErrorCode;
import practice.communityservice.domain.model.User;

import java.util.Optional;

@RequiredArgsConstructor
public class DuplicatedEmailValidator extends AbstractValidator{
    private final Optional<User> foundUser;
    @Override
    public void validate() {
        if(foundUser.isPresent()){
            throw new BadRequestException(
                    ErrorCode.ROW_ALREADY_EXIST,
                    "이미 존재하는 이메일입니다."
            );
        }
    }
}
